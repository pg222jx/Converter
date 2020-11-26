package com.company.View;

public class ViewFactory {
    public static AView getConsoleView(String lang) {
        if (lang.equals("1")) {
            return new Console();
        } else {
            throw new IllegalArgumentException();
        }
    }
}

