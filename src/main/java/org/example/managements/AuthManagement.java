package org.example.managements;

public class AuthManagement {
    static String correctToken = "tokenValido123";
    static String unCorrectToken = "";
    public static String getToken() {
        return unCorrectToken;
    }

    public static boolean isTokenValid(String token) {
        return "tokenValido123".equals(token);
    }
}
