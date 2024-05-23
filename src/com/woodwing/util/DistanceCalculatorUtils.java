package com.woodwing.util;

public class DistanceCalculatorUtils {

    public static final Double YARD_TO_METER = 0.9144;

    public static Double convertYardToMeter(double distance) {

        return distance * YARD_TO_METER;
    }
}
