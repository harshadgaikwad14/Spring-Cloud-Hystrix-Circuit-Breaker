package com.example.demo;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class ClientSideServiceController {
     
    @Autowired
    ServerSideServiceDelegate serverSideServiceDelegate;
 
    @RequestMapping(value = "/getClient", method = RequestMethod.GET)
    public String getStudents() {
        System.out.println("Going to call server side service to get data!");
        return serverSideServiceDelegate.callServiceAndGetData();
    }
}