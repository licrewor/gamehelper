package com.crewor.gamehelper.winio;

import com.sun.jna.NativeLibrary;

public class VirtualKeyBoard {
	public static final WinIo winIo = WinIo.INSTANCE;

	public static void KeyDown(int key) throws Exception {
		User32Util.KBCWait4IBE();
		winIo.SetPortVal(WinIo.CONTROL_PORT, 0xd2, 1);
		User32Util.KBCWait4IBE();
		winIo.SetPortVal(WinIo.DATA_PORT, key, 1);
	}

	public static void KeyUp(int key) throws Exception {
		User32Util.KBCWait4IBE();
		winIo.SetPortVal(WinIo.CONTROL_PORT, 0xd2, 1);
		User32Util.KBCWait4IBE();
		winIo.SetPortVal(WinIo.DATA_PORT, (key | 0x80), 1);
	}

	public static void KeyPress(char key) throws Exception {
		KeyPress(VKMapping.toVK("" + key));
	}

	public static void KeyPress(int vk) throws Exception {
		int scan = User32.INSTANCE.MapVirtualKey(vk, 0);
		KeyDown(scan);
		Thread.sleep(50);
		KeyUp(scan);
	}

	public static void main(String[] args) throws Exception {
		if (!WinIo.INSTANCE.InitializeWinIo()) {
			System.err.println("Cannot Initialize the WinIO");
			System.exit(1);
		}
		String s = "helloworld";
		Runtime.getRuntime().exec("notepad");
		for (int i = 0; i < s.length(); i++) {
			KeyPress(s.charAt(i));
		}
	}

}
