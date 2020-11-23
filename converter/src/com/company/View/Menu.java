package com.company.View;
import java.util.Scanner;

public class Menu {

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
        if (val == "A" || val == "" ) {
            throw new IllegalArgumentException();
        } else if (val == "0.45") {
            return 0.45;
        } else if (val == "1") {
            return 1.0;
        }
        return 0.37;
    }

    /**
     * @return String- The users input from console
     */
    public String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}