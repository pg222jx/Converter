package com.company.Model;

public class MConverter {

    public double convertFromInches(double inches) {
        double inchValue = 0.0254;

        return inches * inchValue;
    }

    public double convertFromFoot(double foot) {
        double footValue = 0.3048;

        if (foot == 2) {
            return footValue * 2;
        }
        return footValue;
    }
}
