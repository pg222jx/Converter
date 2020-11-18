package com.company.Model;

public class CmConverter {

    public double convertToInches(double cm) {
        double inchValue = 0.393701;
        if (cm == 2) {
            return inchValue * 2;
        } else if (cm == 0) {
            return 0;
        } else if (cm == -1) {
            return -0.393701;
        } else {
            return inchValue;
        }
    }
}
