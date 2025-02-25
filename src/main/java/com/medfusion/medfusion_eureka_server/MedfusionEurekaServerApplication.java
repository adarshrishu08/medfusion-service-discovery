package com.medfusion.medfusion_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MedfusionEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedfusionEurekaServerApplication.class, args);
	}

}
