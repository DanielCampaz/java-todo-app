package org.example.screens.login;



import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;


public class LoginFrame  extends JFrame {
    static int WIDTH = 1366;
    static int HEIGHT = 768;
    public LoginFrame() {
        super();
        init();
    }


    protected void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(WIDTH, HEIGHT));
        setLocationRelativeTo(null);
        setLayout(new MigLayout("al center center"));

        initComponents();

        setVisible(true);
    }


    protected void initComponents() {
        LoginPanel mainPanel = new LoginPanel(this);

        add(mainPanel);
    }
}
