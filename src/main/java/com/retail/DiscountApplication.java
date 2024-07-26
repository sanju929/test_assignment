package com.retail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The entry point for the Discount application.
 *
 * This class contains the main method, which is used to launch the Spring Boot application.
 * It triggers the auto-configuration and initialization of the Spring context.
 */
@SpringBootApplication
public class DiscountApplication {

	/**
	 * The main method that starts the Spring Boot application.
	 *
	 * @param args command-line arguments passed to the application
	 */
	public static void main(String[] args) {
		SpringApplication.run(DiscountApplication.class, args);
	}
}

