package com.company.View;
import java.util.Arrays;
import java.util.Scanner;

public class Console {
    /**
     * Writes to output stream
     */
    public String getWelcomeMessage() {
        String message = "Welcome to converter!\nWhich unit do you want to convert to? \n";

        int inc = 0;
        for (Input unit : Input.values()) {
            inc = inc+1;
            message += Integer.toString(inc) + ": " +  unit + "\n";
        }

        return message;
    }

    /**
     * Writes to output stream
     */
    public String getConvertFromMessage() {
        String message = "What unit do you want to convert from?\n";

        int inc = 0;
        for (Input unit : Input.values()) {
            inc = inc+1;
            message += Integer.toString(inc) + ": " +  unit + "\n";
        }

        return message;
    }

    /**
     * Writes to output stream
     */
    public void printToConsole(String string) { System.out.print(string); }

    /**
     * @param input String
     * @return Input - The chosen menu option.
     */
    public Input getMenuChoice(String input) {
        if (input.equals("1")) {
            return Input.Meter;
        } else if (input.equals("2")) {
            return Input.Centimeter;
        } else if (input.equals("3")) {
            return Input.Inches;
        } else if (input.equals("4")) {
            return Input.Foot;
        }
        return null;
    }

    /**
     * @param val String
     * @return The value converted to double.
     */
    public double getValue(String val) {
        String alphabeticChars = "[a-zA-Z]+";
        if (val.matches(alphabeticChars) || val.length() == 0) {
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