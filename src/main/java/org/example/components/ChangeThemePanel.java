package org.example.components;

import org.example.themes.CustomTheme_Dark;
import org.example.themes.CustomTheme_Light;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeThemePanel extends JPanel {
    
    public ChangeThemePanel() {
        super();
        initComponents();
    }
    
    public void initComponents() {
        JButton btn = new JButton("Change Theme");
        btn.addActionListener(new ActionListener() {
            boolean isDark = true;
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isDark) {
                    SwingUtilities.invokeLater(() -> {
                    btn.setText("Change Theme to Dark");
                        try {
                            UIManager.setLookAndFeel( new CustomTheme_Light() );
                            SwingUtilities.updateComponentTreeUI(SwingUtilities.getRootPane(btn));
                        } catch( Exception ex ) {
                            System.err.println( "Failed to initialize LaF" );
                        }
                    isDark = false;
                    });
                } else {
                    SwingUtilities.invokeLater(() -> {
                    btn.setText("Change Theme to Light");
                        try {
                            UIManager.setLookAndFeel( new CustomTheme_Dark() );
                            SwingUtilities.updateComponentTreeUI(SwingUtilities.getRootPane(btn));
                        } catch( Exception ex ) {
                            System.err.println( "Failed to initialize LaF" );
                        }
                    isDark= true;
                    });
                }
            }
        });
        btn.setSize(new Dimension(50,20));
        add(btn);

    }
}
