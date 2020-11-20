package com.company.Model;

public class MConverter {

    public double convertFromInches(double inches) {
        double inchValue = 0.0254;

        return inches * inchValue;
    }

    public double convertFromFoot(double inches) {
        return 0.3048;
    }
}
