package com.company.Model;

import com.company.View.Input;

public class ConverterFactory {
    /**
     * @param unit Input
     * @param value double
     * @return new MConverter()
     */
    public static Converter getConverter(Input unit, double value) {
        if (unit.equals(Input.Meter)) return new MConverter(value);
        else {
            throw new IllegalArgumentException();
        }
    }
}
