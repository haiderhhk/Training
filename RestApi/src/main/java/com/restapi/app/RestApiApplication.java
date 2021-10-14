package com.restapi.app;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class },scanBasePackages= {"com.restapi.app"})

public class RestApiApplication {

	public static void main(String[] args) {
		 SpringApplication.run(RestApiApplication.class, args);
		
	}

}
