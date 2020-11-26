package com.company.Controller;

import com.company.View.AView;
import com.company.View.StartMenu;

public class SubApplication {
    private StartMenu startMenu;

    /**
     * @return - the by the user chosen view
     */
    public AView doGetView() {
        String message = startMenu.getWhatViewMessage();
        startMenu.printToConsole(message);

        return null;
    }

    public SubApplication (StartMenu startMenu) {
        this.startMenu = startMenu;
    }
}