package com.example.demo;
 
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
 
@Service
public class ServerSideServiceDelegate {
 
    @Autowired
    RestTemplate restTemplate;
     
    @HystrixCommand(fallbackMethod = "callServiceAndGetData_Fallback")
    public String callServiceAndGetData() {
 
        
        String response = restTemplate.getForObject("http://localhost:8888/getService/", String.class);
        		/*restTemplate
                .exchange("http://localhost:8888/getService/"
                , HttpMethod.GET
                , null, String.class, String.class).getBody();*/
        
        
 
        System.out.println("Response Received as " + response + " -  " + new Date());
 
        return "NORMAL FLOW !!! " + response + " -  " + new Date();
    }
     
    @SuppressWarnings("unused")
    private String callServiceAndGetData_Fallback() {
 
        System.out.println("Student Service is down!!! fallback route enabled...");
 
        return "CIRCUIT BREAKER ENABLED!!! No Response From Server Side  Service at this moment. " +
                    " Service will be back shortly . "
                    + "SpringCloud-Hystrix-Circuit-Breaker-Service Is Down- " + new Date();
    }
 
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}