package com.company.View;


public class StartMenu {
    /**
     * @return - The message with the menu languages.
     */
    public String getWhatViewMessage() {
        return "1. English \n2. Svenska\n";
    }

    /**
     *  @param message String
     *  Writes to output stream
     */
    public void printToConsole(String message) {
        System.out.print(message);
    }
}
