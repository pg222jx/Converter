package com.company;

import com.company.View.Menu;
import com.company.Controller.Application;
import com.company.Model.MConverter;

public class Main {

    public static void main(String[] args) {
        Application app = new Application(new Menu(), new MConverter());
        app.start();
    }
}
