package com.company.Model;

import com.company.View.Input;


public class ConverterFactory {
    public Converter getConverter(Input unit, double value) {
        if (unit.equals(Input.Meter)) return new MConverter(value);
        else {
            return null;
        }
    }
}
