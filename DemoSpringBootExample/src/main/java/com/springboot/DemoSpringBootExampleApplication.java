package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootExampleApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoSpringBootExampleApplication.class);
	public static void main(String[] args) {
		LOGGER.trace("for tracing purpose");
		LOGGER.debug("for debugging purpose");
		LOGGER.info("for informational purpose");
		LOGGER.warn("for warning purpose");
		LOGGER.error("for logging errors");
		SpringApplication.run(DemoSpringBootExampleApplication.class, args);
	}

}
