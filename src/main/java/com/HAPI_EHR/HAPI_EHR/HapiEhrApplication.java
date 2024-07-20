package com.HAPI_EHR.HAPI_EHR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "controller")
public class HapiEhrApplication {

	public static void main(String[] args) {
		SpringApplication.run(HapiEhrApplication.class, args);
	}

}
