package com.company.Model;

public class CmConverter {
    double inchValue = 0.393701;

    public double convertToInches(double cm) {
        double inches = cm * inchValue;
        return inches;
    }
}
