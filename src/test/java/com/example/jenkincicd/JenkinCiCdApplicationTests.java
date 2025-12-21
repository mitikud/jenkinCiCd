package com.example.jenkincicd;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinCiCdApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(JenkinCiCdApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("Test r case excuiting...");
        logger.info("Test case excuiting... second log statment");
        assertEquals(true, true);
    }

}
