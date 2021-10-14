package com.dcb_micro_dept.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

public class DcbMicroDeparmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DcbMicroDeparmentApplication.class, args);
		
		
		
	}

}
