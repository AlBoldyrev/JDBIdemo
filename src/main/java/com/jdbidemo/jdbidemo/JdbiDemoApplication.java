package com.jdbidemo.jdbidemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbiDemoApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(JdbiDemoApplication.class, args);

    }
}
