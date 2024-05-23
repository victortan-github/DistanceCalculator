package com.woodwing.bean;

import com.woodwing.util.DistanceCalculatorUtils;

public class DistanceBean {

    private Double distance;
    private String unit;

    public DistanceBean(Double distance, String unit) {
        this.distance = distance;
        this.unit = unit;
    }

    /**
     * @return the distance
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getDistanceInMeter() {

        if (unit.equalsIgnoreCase("yard")) {
            return DistanceCalculatorUtils.convertYardToMeter(distance);
        }
        return distance;
    }
}
