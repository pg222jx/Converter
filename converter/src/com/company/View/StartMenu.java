package com.company.View;

/**
 * @return - The message with the menu languages.
 */
public class StartMenu {
    public String getWhatViewMessage() {
        return "1. English \n2. Svenska\n";
    }

    public void printToConsole(String message) {
        System.out.print(message);
    }
}
