package com.company.View;
import java.util.Scanner;

public class Menu {

    /**
     *
     * @return
     */
    public Input.MenuChoices getInput() {
        if (readLine() == "m") {
            return Input.MenuChoices.Meter;
        }
        return null;
    }

    /**
     *
     */
    public String readLine() {
        Scanner sc = new Scanner(System.in);
        return "m";
    }
}