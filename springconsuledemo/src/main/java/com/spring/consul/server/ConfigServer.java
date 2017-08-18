package com.spring.consul.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer
@ComponentScan("com.spring.consul")
public class ConfigServer {
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigServer.class, args);
	}
	
	@Bean
	public RequestContextListener requestContextListener() {
	    return new RequestContextListener();
	}

}
