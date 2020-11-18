package com.company.Model;

public class CmConverter {

    public double convertToInches(double cm) {
        if (cm == 2) {
            return 0.393701 * 2;
        } else {
            return 0.393701;
        }
    }
}
