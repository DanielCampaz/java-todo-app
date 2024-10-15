package org.example.screens.dashboard;


import javax.swing.*;
import java.awt.*;


public class DashboardFrame extends JFrame {
    static int WIDTH = 500;
    static int HEIGHT = 500;
    public DashboardFrame() {
        super();
        init();
        initComponent();
    }

    protected void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(WIDTH, HEIGHT));

        initComponent();

        setVisible(true);
    }

    protected void initComponent() {

    }
}
