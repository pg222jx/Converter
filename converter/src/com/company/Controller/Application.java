package com.company.Controller;

import com.company.View.AView;
import com.company.View.Input;
import com.company.Model.ConverterFactory;
import com.company.Model.Converter;

public class Application {
    private AView console;

    /**
     *  Runs the application
     */
    public void start() {
        String message = console.getWelcomeMessage();
        console.printToConsole(message);

        String input = console.getInput();
        Input convertTo = console.getMenuChoice(input);

        if (convertTo == Input.Meter) {
            convertToMeter(input, convertTo);
        }
    }

    private void convertToMeter(String input, Input convertTo) {
        String message = console.getConvertFromMessage();
        console.printToConsole(message);

        input = console.getInput();
        Input convertFrom = console.getMenuChoice(input);

        message = console.getDoubleToConvertMessage();
        console.printToConsole(message);

        input = console.getInput();
        Double digitValue = console.getValue(input);

        getConvertTo(convertTo, convertFrom, digitValue);
    }

    private void getConvertTo(Input convertTo,Input convertFrom, Double digitValue) {
        if (convertFrom == Input.Inches) {
            convertFromInches(convertTo, digitValue);
        } else if (convertFrom == Input.Foot) {
            convertFromFoot(convertTo, digitValue);
        }
    }

    private void convertFromInches(Input convertTo, Double digitValue) {
        Converter converter = ConverterFactory.getConverter(convertTo, digitValue);
        String message = console.getFinalOutputMessage(converter.convertFromInches());
        console.printToConsole(message);
    }

    private void convertFromFoot(Input convertTo, Double digitValue) {
        Converter converter = ConverterFactory.getConverter(convertTo, digitValue);
        String message = console.getFinalOutputMessage(converter.convertFromFoot());
        console.printToConsole(message);
    }

    public Application (AView console) {
        this.console = console;
    }
}