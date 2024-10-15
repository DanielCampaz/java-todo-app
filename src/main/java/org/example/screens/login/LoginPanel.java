package org.example.screens.login;

import com.formdev.flatlaf.FlatClientProperties;
import com.sun.tools.jconsole.JConsoleContext;
import net.miginfocom.swing.MigLayout;
import org.example.screens.core.Panel;
import org.example.screens.dashboard.DashboardFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginPanel extends Panel implements ActionListener {
    JTextField txtEmail;
    JPasswordField txtPassword;
    JFrame frame;

    public LoginPanel(JFrame frame) {
        super();
        this.frame = frame;
    }

    @Override
    protected void initComponent()  {
        setLayout(new MigLayout("wrap,gapy 3", "[fill,300]"));

        //add(new JLabel(new FlatSVGIcon("login/icon/logo.svg", 1.5f)));

        JLabel lbTitle = new JLabel("Welcome back", JLabel.CENTER);
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "" +
                "font:bold +15;");
        add(lbTitle, "gapy 8 8");

        add(new JLabel("Sign in to access to your dashboard,", JLabel.CENTER));
        add(new JLabel("setting and projects.", JLabel.CENTER));

        JButton cmdFacebook = new JButton("Connect with Facebook");
        cmdFacebook.putClientProperty(FlatClientProperties.STYLE, "" +
                "focusWidth:0;" +
                "font:+1;");
        add(cmdFacebook, "gapy 15 10");

        JLabel lbSeparator = new JLabel("Or sign in with email");
        lbSeparator.putClientProperty(FlatClientProperties.STYLE, "" +
                "foreground:$Label.disabledForeground;" +
                "font:-1;");

        // sizegroup to make group component are same size

        add(createSeparator(), "split 3,sizegroup g1");
        add(lbSeparator, "sizegroup g1");
        add(createSeparator(), "sizegroup g1");

        JLabel lbEmail = new JLabel("Email");
        lbEmail.putClientProperty(FlatClientProperties.STYLE, "" +
                "font:bold;");
        add(lbEmail, "gapy 10 5");

         txtEmail = new JTextField();
        txtEmail.putClientProperty(FlatClientProperties.STYLE, "" +
                "iconTextGap:10;");
        txtEmail.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your email");
        //txtEmail.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("login/icon/email.svg", 0.35f));

        add(txtEmail);

        JLabel lbPassword = new JLabel("Password");
        lbPassword.putClientProperty(FlatClientProperties.STYLE, "" +
                "font:bold;");

        add(lbPassword, "gapy 10 5,split 2");

        JButton cmdForgotPassword = createNoBorderButton("Forgot Password ?");
        add(cmdForgotPassword, "grow 0,gapy 10 5");

         txtPassword = new JPasswordField();
        txtPassword.putClientProperty(FlatClientProperties.STYLE, "" +
                "iconTextGap:10;" +
                "showRevealButton:true;");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your password");
        //txtPassword.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("login/icon/password.svg", 0.35f));

        add(txtPassword);

        add(new JCheckBox("Remember for 30 days"), "gapy 10 10");

        JButton cmdSignIn = new JButton("Sign in") {
            @Override
            public boolean isDefaultButton() {
                return true;
            }
        };
        cmdSignIn.putClientProperty(FlatClientProperties.STYLE, "" +
                "foreground:#FFFFFF;" +
                "iconTextGap:10;");
        cmdSignIn.setHorizontalTextPosition(JButton.LEADING);
        cmdSignIn.addActionListener(this);
        add(cmdSignIn, "gapy n 10");

        JLabel lbNoAccount=new JLabel("No account ?");
        lbNoAccount.putClientProperty(FlatClientProperties.STYLE,"" +
                "foreground:$Label.disabledForeground;");
        add(lbNoAccount,"split 2,gapx push n");

        JButton cmdCreateAccount=createNoBorderButton("Create an account");

        add(cmdCreateAccount,"gapx n push");


    }

    private JSeparator createSeparator() {
        JSeparator separator = new JSeparator();
        separator.putClientProperty(FlatClientProperties.STYLE, "" +
                "stripeIndent:8;");
        return separator;
    }

    private JButton createNoBorderButton(String text) {
        JButton button = new JButton(text);
        button.putClientProperty(FlatClientProperties.STYLE, "" +
                "foreground:$Component.accentColor;" +
                "margin:1,5,1,5;" +
                "borderWidth:0;" +
                "focusWidth:0;" +
                "innerFocusWidth:0;" +
                "background:null;");
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String email =(this.txtEmail.getText());
        String password = (new String(this.txtPassword.getPassword()));

        if(email.equals("dscampaz3110@gmail.com") && password.equals("12345")) {
            this.frame.dispose();
            new DashboardFrame();
        }

    }
}
