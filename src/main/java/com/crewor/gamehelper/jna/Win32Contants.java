package com.crewor.gamehelper.jna;

/**
 * @author:likun
 * @email:likun18@jd.com
 * @erp:likun101
 * @CreateTime:2019/1/25 14:37
 * @Project notes
 */
public class Win32Contants {

    /**
     * 设置文本
     */
    public static final int WM_SETTEXT = 0x000C;
    /**
     *
     */
    public static final int WM_CHAR = 0x0102;
    /**
     * The WM_PAINT message is sent when the system or another application makes
     * a request to paint a portion of an \ application's window.
     */
    int WM_PAINT = 0x000F;

    /**
     * Sent as a signal that a window or an application should terminate.
     */
    int WM_CLOSE = 0x0010;

    /**
     * Indicates a request to terminate an application, and is generated when
     * the application calls the PostQuitMessage function.
     */
    int WM_QUIT = 0x0012;

    /**
     * Sent to a window when the window is about to be hidden or shown.
     */
    int WM_SHOWWINDOW = 0x0018;

    /**
     * Sent to the parent window of an owner-drawn button, combo box, list box,
     * or menu when a visual aspect of the button, combo box, list box, or menu
     * has changed.
     */
    int WM_DRAWITEM = 0x002B;

    /**
     * Posted to the window with the keyboard focus when a nonsystem key is
     * pressed. A nonsystem key is a key that is pressed when the ALT key is not
     * pressed.
     */
    int WM_KEYDOWN = 0x0100;


    /**
     * A window receives this message when the user chooses a command from the
     * Window menu (formerly known as the system or control menu) or when the
     * user chooses the maximize button, minimize button, restore button, or
     * close button.
     */
    int WM_SYSCOMMAND = 0x0112;

    /**
     * An application sends the WM_MDIMAXIMIZE message to a multiple-document
     * interface (MDI) client window to maximize an MDI child window.
     */
    int WM_MDIMAXIMIZE = 0x0225;

    /**
     * Posted when the user presses a hot key registered by the RegisterHotKey
     * function. The message is placed at the top of the message queue
     * associated with the thread that registered the hot key.
     */
    int WM_HOTKEY = 0x0312;

    /**
     * Used to define private messages for use by private window classes,
     * usually of the form WM_USER+x, where x is an integer value.
     */
    int WM_USER = 0x0400;

    /**
     * An application sends the WM_COPYDATA message to pass data to another application.
     */
    int WM_COPYDATA = 0x004A;

    int WM_KEYUP = 257;
    int WM_SYSKEYDOWN = 260;
    int WM_SYSKEYUP = 261;

    int WM_SESSION_CHANGE = 0x2b1;
    int WM_CREATE = 0x0001;
    int WM_SIZE = 0x0005;
    int WM_DESTROY = 0x0002;

    public static final int WM_DEVICECHANGE = 0x0219;

    /**
     * Sent to a window to retrieve a handle to the large or small icon
     * associated with a window. The system displays the large icon in the
     * ALT+TAB dialog, and the small icon in the window caption.
     */
    int WM_GETICON = 0x007F;

    /**
     * Retrieve the large icon for the window.
     */
    int ICON_BIG = 1;

    /**
     * Retrieve the small icon for the window.
     */
    int ICON_SMALL = 0;

    /**
     * Retrieves the small icon provided by the application. If the application
     * does not provide one, the system uses the system-generated icon for that
     * window.
     */
    int ICON_SMALL2 = 2;


    public static class MouseEvent {
        public static int MOUSEEVENTF_MOVE = 0x0001;      //移动鼠标
        public static int MOUSEEVENTF_LEFTDOWN = 0x0002; //模拟鼠标左键按下
        public static int MOUSEEVENTF_LEFTUP = 0x0004; //模拟鼠标左键抬起
        public static int MOUSEEVENTF_RIGHTDOWN = 0x0008; //模拟鼠标右键按下
        public static int MOUSEEVENTF_RIGHTUP = 0x0010; //模拟鼠标右键抬起
        public static int MOUSEEVENTF_MIDDLEDOWN = 0x0020;// 模拟鼠标中键按下
        public static int MOUSEEVENTF_MIDDLEUP = 0x0040; //模拟鼠标中键抬起
        public static int MOUSEEVENTF_ABSOLUTE = 0x8000; //标示是否采用绝对坐标
    }
}
