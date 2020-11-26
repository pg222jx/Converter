package com.company.Model;

public class MConverter extends Converter {
    private double value;

    public double convertFromInches() {
        double inchValue = 0.0254;

        return value * inchValue;
    }

    /**value
     * @return Value of the calculations of foot in meter
     */
    public double convertFromFoot() {
        double footValue = 0.3048;

        return value * footValue;
    }

    public MConverter(double value) {
        this.value = value;
    }

}
