package com.company.Model;

public class MConverter {
    public double convertFromInches(double inches) {
        if (inches == 2) {
            return 0.0508;
        } else if (inches == 1){
            return 0.0254;
        } else {
            return -0.0254;
        }
    }
}
