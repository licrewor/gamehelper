package com.crewor.gamehelper.jna;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.W32APIOptions;

/**
 * @author:likun
 * @email:likun18@jd.com
 * @erp:likun101
 * @CreateTime:2019/1/25 14:02
 * @Project notes
 */
public interface User32Lib extends User32 {
    User32Lib INSTANCE = Native.load("user32", User32Lib.class, W32APIOptions.DEFAULT_OPTIONS);


    long SendMessage(long hWnd, int msg, int wParam, String lParam);

    long SendMessage(long hWnd, int msg, int wParam, long lParam);


    void keybd_event(int bvk,int bscan,int dword,long dwExtraInfo);

    int mouse_event(int dwFlags, int dx, int dy, int cButtons, int dwExtraInfo);
}
