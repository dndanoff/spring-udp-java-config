package com.danoff.udp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableIntegration
public class UdpClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdpClientApplication.class, args);
	}
}
