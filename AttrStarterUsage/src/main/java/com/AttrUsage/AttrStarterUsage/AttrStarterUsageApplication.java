package com.AttrUsage.AttrStarterUsage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AttrStarterUsageApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AttrStarterUsageApplication.class, args);
		((AttrUsageService)applicationContext.getBean ( "attrUsageService" )).getAttributes ();
	}

}
