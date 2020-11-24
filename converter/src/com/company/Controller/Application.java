package com.company.Controller;

import com.company.View.Menu;
import com.company.View.Input;
import com.company.Model.MConverter;

public class Application {
    private Menu menu;
    private MConverter mConverter;

    /**
     * @return the converted value.
     */
    public double start() {
        String input = menu.getInput();
        Input convertTo = menu.getMenuChoice(input);

        if (convertTo == Input.Meter) {
            input = menu.getInput();
            Input convertFrom = menu.getMenuChoice(input);

            if (convertFrom == Input.Inches) {
                return mConverter.convertFromInches(1.0);
            }
        }

        return 0;
    }

    public Application (Menu menu, MConverter mConverter) {
        this.menu = menu;
        this.mConverter = mConverter;
    }
}
