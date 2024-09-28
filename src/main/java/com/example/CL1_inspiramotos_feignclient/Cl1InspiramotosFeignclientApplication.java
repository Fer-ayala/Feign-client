package com.example.CL1_inspiramotos_feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Cl1InspiramotosFeignclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cl1InspiramotosFeignclientApplication.class, args);
	}

}
