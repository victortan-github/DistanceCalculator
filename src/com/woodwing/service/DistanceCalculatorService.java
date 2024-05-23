package com.woodwing.service;

import com.woodwing.manager.DistanceCalculatorManager;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class DistanceCalculatorService {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/DistanceCalculatorWS", new DistanceCalculatorManager());
    }
}
