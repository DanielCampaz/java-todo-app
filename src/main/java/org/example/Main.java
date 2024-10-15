package org.example;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import org.example.managements.AuthManagement;
import org.example.screens.dashboard.DashboardFrame;
import org.example.screens.login.LoginFrame;
import org.example.themes.CustomTheme_Dark;

public class Main {

    public static void main(String[] args) {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("themes");
        CustomTheme_Dark.setup();

        //Main application = new Main("Example Application");
        String token = AuthManagement.getToken();
        if (AuthManagement.isTokenValid(token)) {
            // Si el token es válido, abre directamente el Dashboard
            new DashboardFrame();
        } else {
            // Si no hay token válido, muestra la ventana de Login
            new LoginFrame();
        }

    }
}