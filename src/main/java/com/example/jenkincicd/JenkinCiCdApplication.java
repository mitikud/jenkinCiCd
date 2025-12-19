package com.example.jenkincicd;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinCiCdApplication {
    public  static Logger logger = LoggerFactory.getLogger(JenkinCiCdApplication.class);

    @PostConstruct
    public void init(){
        logger.info("Init Application started ...");
    }
    public static void main(String[] args) {

        logger.info("Application excuited");
        SpringApplication.run(JenkinCiCdApplication.class, args);
    }

}
