package com.crewor.gamehelper.click;

import com.crewor.gamehelper.annotation.Plugin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author:likun
 * @email:likun18@jd.com
 * @erp:likun101
 * @CreateTime:2019/1/24 11:00
 * @Project notes
 */
@Plugin("连点器")
public class ClickFrame extends JPanel {
    private final ClickTool clickTool = new ClickTool();

    public ClickFrame() {
        this.setLayout(new FlowLayout());
        this.setBounds(0, 0, 400, 400);
        this.setVisible(true);
        this.setBackground(new Color(0x0c0c0c));
        addBtnStart();
    }

    private void addBtnStart() {
        JButton start = new JButton("开始");
        start.setActionCommand("START");
        this.add(start);
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("start".equalsIgnoreCase(e.getActionCommand())) {
                    //do start
                    clickTool.start();
                    start.setText("结束");
                    start.setActionCommand("END");
                } else {
                    start.setActionCommand("START");
                    start.setText("开始");
                    clickTool.stop();
                }
            }
        });


    }
}
