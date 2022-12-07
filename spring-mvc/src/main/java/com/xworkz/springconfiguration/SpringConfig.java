package com.xworkz.springconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {

	public SpringConfig() {
		System.out.println("created default constructor of springconfig.....");
	}

}
