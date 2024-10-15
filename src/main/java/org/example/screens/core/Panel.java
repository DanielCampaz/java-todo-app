package org.example.screens.core;

import javax.swing.*;

public abstract class Panel extends JPanel {

    public Panel() {
        super();
        initComponent();
    }

    protected abstract void initComponent();
}
