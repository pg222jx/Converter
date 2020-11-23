package com.company.View;
import java.util.Scanner;

public class Menu {

    /**
     *
     * @return
     */
    public Input getMenuChoice(String input) {
        if (input == "m") {
            return Input.Meter;
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