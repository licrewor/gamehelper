import com.crewor.gamehelper.jna.User32Lib;
import com.crewor.gamehelper.jna.Win32Contants;
import com.sun.jna.platform.win32.WinUser;

public class JNATest {

    public static void main(String[] args) {
        User32Lib lib = User32Lib.INSTANCE;

        lib.SendMessage(0x000A0D84, Win32Contants.WM_SETTEXT, 64, "我是谁\n");
    }
}
