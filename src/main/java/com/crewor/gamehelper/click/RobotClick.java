package com.crewor.gamehelper.click;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * @author:likun
 * @email:likun18@jd.com
 * @erp:likun101
 * @CreateTime:2019/1/25 16:31
 * @Project notes
 */
public class RobotClick {
    private static Robot robot;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void leftClick() throws InterruptedException {
        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(10);
        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
    }
}
