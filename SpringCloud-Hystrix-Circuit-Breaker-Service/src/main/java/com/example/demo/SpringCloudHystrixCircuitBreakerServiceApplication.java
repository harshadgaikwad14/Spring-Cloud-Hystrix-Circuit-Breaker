package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudHystrixCircuitBreakerServiceApplication {

	/*
	 * Run Url : http://localhost:8888/getService
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHystrixCircuitBreakerServiceApplication.class, args);
	}
}
