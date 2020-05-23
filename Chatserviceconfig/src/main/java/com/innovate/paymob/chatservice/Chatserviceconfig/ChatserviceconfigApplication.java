package com.innovate.paymob.chatservice.Chatserviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ChatserviceconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatserviceconfigApplication.class, args);
	}

}
