package com.company.View;
import java.util.Scanner;

public class Console extends AView {
    /**
     * @return - The message asking for unit to convert to
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
     * @return - The message asking for unit to convert from
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
     * @param value double - The converted value
     * @return - The message with the final conversion
     */
    public String getFinalOutputMessage(double value) {
        String message = "The final result is......:\n" + value;

        return message;
    }

    /**
     * @return - The message with the final conversion
     */
    public String getDoubleToConvertMessage() {
        String message = "Please enter the digit you want to convert with decimal points: \n";

        return message;
    }

    /**
     * @param string String
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
        } else {
            throw new IllegalArgumentException();
        }
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
     * @return String - The users input from console
     */
    public String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}