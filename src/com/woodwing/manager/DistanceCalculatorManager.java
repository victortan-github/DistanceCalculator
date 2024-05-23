package com.woodwing.manager;

import com.woodwing.bean.DistanceBean;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class DistanceCalculatorManager {

    @WebMethod
    public Double calculate(Double distanceA, String unitA, Double distanceB, String unitB) {
        //TODO data checking for Double distanceA and distanceB (!null) 
        //TODO data checking for String unitA and unitB (!null, "yard", "meter")

        DistanceBean distanceBeanA = new DistanceBean(distanceA, unitA);
        DistanceBean distanceBeanB = new DistanceBean(distanceA, unitB);

        return distanceBeanA.getDistanceInMeter() + distanceBeanB.getDistanceInMeter();
    }
}
