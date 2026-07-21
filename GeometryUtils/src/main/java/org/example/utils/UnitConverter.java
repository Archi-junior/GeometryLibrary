package org.example.utils;

public class UnitConverter {

    public static double cmToMetr(double cm) {
        return cm / 100;
    }

    public static double metrToCm(double metr) {
        return metr * 100;
    }

    public static double inchesToCm(double inches) {
        return inches * 2.54;
    }

    public static double cmToInches(double cm) {
        return cm / 2.54;
    }

}