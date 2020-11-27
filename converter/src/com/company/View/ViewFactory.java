package com.company.View;

public class ViewFactory {

    /**
     * @param lang String
     * @return - new instance of Console
     */
    public AView getConsoleView(String lang) {
        if (lang.equals("1")) {
            return new Console();
        } else {
            throw new IllegalArgumentException();
        }
    }
}

