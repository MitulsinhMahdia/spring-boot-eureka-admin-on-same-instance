package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableEurekaServer
@EnableAdminServer
public class EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

	@Configuration
	public class HttpTraceActuatorConfiguration {

		@Bean
		public HttpTraceRepository httpTraceRepository() {
			return new InMemoryHttpTraceRepository();
		}

	}
}
