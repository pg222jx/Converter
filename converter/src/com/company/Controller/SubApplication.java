package com.company.Controller;

import com.company.View.AView;
import com.company.View.StartMenu;

public class SubApplication {
    private StartMenu startMenu;

    public AView doGetView() {
        String message = startMenu.getWhatViewMessage();


        return null;
    }

    public SubApplication (StartMenu startMenu) {
        this.startMenu = startMenu;
    }
}