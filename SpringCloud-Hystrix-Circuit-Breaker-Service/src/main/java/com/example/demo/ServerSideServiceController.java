package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerSideServiceController {

	@RequestMapping(value = "/getService", method = RequestMethod.GET)
	public String getStudents() {

		return "SpringCloud-Hystrix-Circuit-Breaker-Service Up and Running";
	}
}