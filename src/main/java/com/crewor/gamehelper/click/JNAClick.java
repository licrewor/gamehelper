package com.crewor.gamehelper.click;

import com.crewor.gamehelper.jna.User32Lib;

import static com.crewor.gamehelper.jna.Win32Contants.MouseEvent.MOUSEEVENTF_LEFTDOWN;
import static com.crewor.gamehelper.jna.Win32Contants.MouseEvent.MOUSEEVENTF_LEFTUP;

/**
 * @author:likun
 * @email:likun18@jd.com
 * @erp:likun101
 * @CreateTime:2019/1/25 16:19
 * @Project notes
 */
public class JNAClick{
    private static final User32Lib lib = User32Lib.INSTANCE;

    public static void leftClick() {
        lib.mouse_event(MOUSEEVENTF_LEFTDOWN | MOUSEEVENTF_LEFTUP, 0, 0, 0, 0);
    }

    public static void main(String[] args) {
        while(true) {
            JNAClick.leftClick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
