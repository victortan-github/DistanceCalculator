package com.woodwing.test;

import com.woodwing.manager.DistanceCalculatorManager;
import com.woodwing.util.DistanceCalculatorUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DistanceCalculatorManagerTest {

    DistanceCalculatorManager distanceCalculatorManager;

    @Before
    void setUp() {
        distanceCalculatorManager = new DistanceCalculatorManager();
    }

    @Test
    public void givenMeterAndMeter_whenAddition_thenReturnTotalMeter() {
        double actualTotal = distanceCalculatorManager.calculate(1.5, "meter", 1.5, "meter");
        double expectedTotal = 1.5 + 1.5;
        Assert.assertEquals(actualTotal, expectedTotal, 0);
    }

    @Test
    public void givenYardAndYard_whenAddition_thenReturnTotalMeter() {
        double actualTotal = distanceCalculatorManager.calculate(3.0, "yard", 1.5, "yard");
        double expectedTotal = (3.0 * DistanceCalculatorUtils.YARD_TO_METER)
                + (1.5 * DistanceCalculatorUtils.YARD_TO_METER);
        Assert.assertEquals(actualTotal, expectedTotal, 0);
    }

    @Test
    public void givenYardAndMeter_whenAddition_thenReturnTotalMeter() {
        double actualTotal = distanceCalculatorManager.calculate(3.0, "yard", 5.0, "meter");
        double expectedTotal = (3.0 * DistanceCalculatorUtils.YARD_TO_METER) + 5.0;
        Assert.assertEquals(actualTotal, expectedTotal, 0);
    }

    @Test
    public void givenMeterAndYard_whenAddition_thenReturnTotalMeter() {
        double actualTotal = distanceCalculatorManager.calculate(3.0, "meter", 5.0, "yard");
        double expectedTotal = 3.0 + (5.0 * DistanceCalculatorUtils.YARD_TO_METER);
        Assert.assertEquals(actualTotal, expectedTotal, 0);
    }

    @Test
    public void givenZeroYardAndMeter_whenAddition_thenReturnTotalMeter() {
        double actualTotal = distanceCalculatorManager.calculate(0.0, "yard", 5.0, "meter");
        double expectedTotal = (0.0 * DistanceCalculatorUtils.YARD_TO_METER) + 5.0;
        Assert.assertEquals(actualTotal, expectedTotal, 0);
    }
}
