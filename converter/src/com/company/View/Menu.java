package com.company.View;
import java.util.Scanner;

public class Menu {

    /**
     *
     * @return
     */
    public Input.MenuChoices getMenuChoice() {
        if (getInput() == "m") {
            return Input.MenuChoices.Meter;
        }
        return null;
    }

    /**
     *
     */
    public String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}