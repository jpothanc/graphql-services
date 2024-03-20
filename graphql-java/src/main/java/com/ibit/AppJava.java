package com.ibit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class AppJava implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    private static final Logger logger = LoggerFactory.getLogger(AppJava.class);
    public static void main(String[] args) {
        SpringApplication.run(AppJava.class, args);
        System.out.println("Spring Start");
        logger.info("Spring Start.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        AppJava.applicationContext = applicationContext;
    }
}
