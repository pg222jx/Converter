package com.company.Model;

public class MConverter {

    public double convertFromInches(double inches) {
        double inchValue = 0.0254;

        return inches * inchValue;
    }

    /**
     * @param foot double
     * @return Value of the alculations of fott in meter
     */
    public double convertFromFoot(double foot) {
        double footValue = 0.3048;

        return foot * footValue;
    }
}
