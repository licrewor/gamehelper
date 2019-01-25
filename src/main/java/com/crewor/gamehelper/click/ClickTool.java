package com.crewor.gamehelper.click;

import com.crewor.gamehelper.util.ConsoleLogger;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:likun
 * @email:likun18@jd.com
 * @erp:likun101
 * @CreateTime:2019/1/24 14:07
 * @Project notes
 */
public class ClickTool {
    public static enum ClickType {
        MOUSE_LEFT,
        MOUSE_RIGHT
    }

    private boolean started = false;
    private long millis = 500;
    //循环按键单元（左,右）
    private List<ClickType> loopItem = new ArrayList<>();
    //连续按键间隔（如果一个循环有 左，右，上，下等连续按键的时候，每个键之间的间隔是多少）
    private long clickAfterMillis = 50;

    public ClickTool() {
        millis = 500;
        loopItem.add(ClickType.MOUSE_LEFT);
    }

    public void start() {
        synchronized (this) {
            if (started) {
                return;
            }
            started = true;
            //开启线程连点
            Thread clickThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                        while (started) {
                            Robot robot = new Robot();
                            ConsoleLogger.info("click down");
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(10);
                            ConsoleLogger.info("click up");
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(millis);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            clickThread.start();
        }
    }

    public void stop() {
        synchronized (this) {
            if (!started) {
                return;
            }
            started = false;
        }
    }

    public static void main(String[] args) {
        ClickTool tool = new ClickTool();
        tool.start();
        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(5000);
                        tool.stop();
                        System.out.println("=======停止========");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
