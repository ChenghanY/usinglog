package com.james.usinglog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsingLogApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(UsingLogApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Logger logger = LoggerFactory.getLogger(UsingLogApplication.class);
		logger.error("error");
		logger.warn("warn");
		logger.info("info");
		logger.debug("debug");
		logger.trace("trace");
	}
}
