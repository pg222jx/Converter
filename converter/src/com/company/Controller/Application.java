package com.company.Controller;

import com.company.View.Console;
import com.company.View.Input;
import com.company.Model.MConverter;
import com.company.Model.ConverterFactory;
import com.company.Model.Converter;

public class Application {
    private Console console;

    /**
     * @return the converted value.
     */
    public void start() {
        String message = console.getWelcomeMessage();
        console.printToConsole(message);

        String input = console.getInput();
        Input convertTo = console.getMenuChoice(input);

        if (convertTo == Input.Meter) {
            message = console.getConvertFromMessage();
            console.printToConsole(message);

            input = console.getInput();
            Input convertFrom = console.getMenuChoice(input);

            if (convertFrom == Input.Inches) {
                message = console.getDoubleToConvertMessage();
                console.printToConsole(message);

                input = console.getInput();
                Double inchValue = console.getValue(input);

                Converter converter = ConverterFactory.getConverter(convertTo, inchValue);
                message = console.getFinalOutputMessage(converter.convertFromInches());
                console.printToConsole(message);
            }
        }
    }

    public Application (Console console) {
        this.console = console;
    }
}
