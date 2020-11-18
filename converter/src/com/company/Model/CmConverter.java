package com.company.Model;

public class CmConverter {

    public double convertToInches(double cm) {
        double inchValue = 0.393701;

        double inches = cm * inchValue;
        return inches;
    }
}
