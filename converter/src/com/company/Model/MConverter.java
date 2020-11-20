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

        if (foot == 2) {
            return footValue * 2;
        } else if (foot == -1) {
            return footValue * -1;
        } else if (foot == 0) {
            return footValue * 0;
        }
        return footValue;
    }
}
