package com.crewor.gamehelper;

import com.crewor.gamehelper.click.ClickFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @author:likun
 * @email:likun18@jd.com
 * @erp:likun101
 * @CreateTime:2019/1/24 11:02
 * @Project notes
 */
public class TabFrame extends JFrame {
    private JTabbedPane jTabbedPane = new JTabbedPane();

    public TabFrame() {
        this.setLayout(new GridLayout(1, 1));
        this.setBounds(0, 0, 400, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(jTabbedPane);
        this.setVisible(true);

        loadPlugin();
    }

    private void loadPlugin() {
        this.addTab("连点器", new ClickFrame());
    }

    public void addTab(String title, Component component) {
        jTabbedPane.addTab(title, component);
    }

}
