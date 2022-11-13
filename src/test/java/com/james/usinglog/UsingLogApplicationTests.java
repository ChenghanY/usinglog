package com.james.usinglog;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsingLogApplicationTests {

	@Test
	void FirstBabyTest() {
		Logger logger = LoggerFactory.getLogger(UsingLogApplicationTests.class);
		logger.error("error");
		logger.warn("warn");
		logger.info("info");
		logger.debug("debug");
		logger.trace("trace");
	}

	/**
	 * 打开配置的详情
	 */
	@Test
	void printInternalStatusTest() {
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		StatusPrinter.print(lc);
	}

}
