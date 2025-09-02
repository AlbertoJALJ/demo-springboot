package com.users.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class DemoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootApplication.class, args);
	}

}
