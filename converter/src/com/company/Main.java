package com.company;

import com.company.Controller.Application;
import com.company.Controller.SubApplication;
import com.company.View.StartMenu;
import com.company.View.ViewFactory;

public class Main {
    public static void main(String[] args) {
        ViewFactory factory = new ViewFactory();
        StartMenu startMenu = new StartMenu();

        SubApplication subApp = new SubApplication(startMenu, factory);

        Application app = new Application(subApp.getView());
        app.start();
    }
}