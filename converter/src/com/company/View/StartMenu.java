package com.company.View;
import java.util.Scanner;

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

    /**
     *  @return String - The users input from console
     */
    public String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
