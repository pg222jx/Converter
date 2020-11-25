package com.company.Controller;

import com.company.View.Console;
import com.company.View.Input;
import com.company.Model.MConverter;

public class Application {
    private Console console;
    private MConverter mConverter;

    /**
     * @return the converted value.
     */
    public double start() {
        String message = console.getWelcomeMessage();
        console.printToConsole(message);

        String input = console.getInput();
        Input convertTo = console.getMenuChoice(input);

        if (convertTo == Input.Meter) {

            String convertMessage = console.getConvertFromMessage();
            console.printToConsole(convertMessage);

            input = console.getInput();
            Input convertFrom = console.getMenuChoice(input);

            if (convertFrom == Input.Inches) {
                input = console.getInput();
                Double inchValue = console.getValue(input);
                return mConverter.convertFromInches(inchValue);
            }
        }

        return 0;
    }

    public Application (Console console, MConverter mConverter) {
        this.console = console;
        this.mConverter = mConverter;
    }
}
