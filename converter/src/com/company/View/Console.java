package com.company.View;
import java.util.Arrays;
import java.util.Scanner;

public class Console {
    /**
     * Writes to output stream
     */
    public void displayWelcomeMessage() {
        System.out.print("Welcome");
    }


    public void printToConsole(String string) { System.out.print(""); }

    /**
     * @param input String
     * @return Input - The chosen menu option.
     */
    public Input getMenuChoice(String input) {
        if (input == "m") {
            return Input.Meter;
        } else if (input == "c") {
            return Input.Centimeter;
        } else if (input == "i") {
            return Input.Inches;
        } else if (input == "f") {
            return Input.Foot;
        }
        return null;
    }

    /**
     * @param val String
     * @return The value converted to double.
     */
    public double getValue(String val) {
        if (val.matches("[a-zA-Z]+") || val.length() == 0) {
            throw new IllegalArgumentException();
        }
        return  Double.parseDouble(val);
    }

    /**
     * @return String- The users input from console
     */
    public String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}