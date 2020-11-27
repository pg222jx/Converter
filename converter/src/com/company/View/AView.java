package com.company.View;

public abstract class AView {
    public abstract String getWelcomeMessage();
    public abstract String getConvertFromMessage();
    public abstract String getFinalOutputMessage(double value);
    public abstract String getDoubleToConvertMessage();
    public abstract void printToConsole(String string);
    public abstract Input getMenuChoice(String string);
    public abstract double getValue(String val);
    public abstract String getInput();
}