package com.company.Controller;

import com.company.View.AView;
import com.company.View.StartMenu;
import com.company.View.ViewFactory;

public class SubApplication {
    private StartMenu startMenu;
    private ViewFactory viewFactory;

    /**
     * @return - The by the user chosen view
     */
    public AView getView() {
        String message = startMenu.getWhatViewMessage();
        startMenu.printToConsole(message);

        String input = startMenu.getInput();
        AView av = viewFactory.getConsoleView(input);
        return av;
    }

    public SubApplication (StartMenu startMenu, ViewFactory viewFactory) {
        this.startMenu = startMenu;
        this.viewFactory = viewFactory;
    }
}