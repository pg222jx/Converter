package com.company;

import com.company.View.Console;
import com.company.Controller.Application;
import com.company.Model.MConverter;

public class Main {

    public static void main(String[] args) {
        Application app = new Application(new Console(), new MConverter());
        app.start();
    }
}
