package org.example;

import org.example.components.ChangeThemePanel;
import org.example.themes.CustomTheme_Dark;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    static int WIDTH = 500;
    static int HEIGHT = 500;

    public Main() {
        super();
        init();
    }

    public Main(String title) {
        super(title);
        init();
    }

    public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(Main.WIDTH, Main.HEIGHT));

        initComponents();

        setVisible(true);
    }

    public void initComponents() {
        add(new ChangeThemePanel());
    }

    public static void main(String[] args) {
        CustomTheme_Dark.setup();

        Main application = new Main("Example Application");

    }
}