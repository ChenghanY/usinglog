package com.james.usinglog;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FileOnlyTests {

    /**
     * 默认root下的appender 都会执行。
     * 需求：某个类只想打印到文件中, 不打印到控制台
     * 实现：为某个类设定特殊的logger, 并且不继承
     * 原理：继承会导致向上寻找到root, 加载root的appender
     */
    @Test
    void test() {
        Logger logger = LoggerFactory.getLogger(FileOnlyTests.class);
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }
}
