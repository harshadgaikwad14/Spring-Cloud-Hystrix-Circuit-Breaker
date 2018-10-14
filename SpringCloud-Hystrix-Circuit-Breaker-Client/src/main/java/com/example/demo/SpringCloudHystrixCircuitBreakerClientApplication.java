package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class SpringCloudHystrixCircuitBreakerClientApplication {

	/*
	 * Run Url : http://localhost:8889/getClient
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHystrixCircuitBreakerClientApplication.class, args);
	}
}
