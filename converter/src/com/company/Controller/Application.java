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
                input = menu.getInput();
                Double inchValue = menu.getValue(input);
                return mConverter.convertFromInches(inchValue);
            }
        }

        return 0;
    }

    public Application (Menu menu, MConverter mConverter) {
        this.menu = menu;
        this.mConverter = mConverter;
    }
}
