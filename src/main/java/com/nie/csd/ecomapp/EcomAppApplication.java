package com.nie.csd.ecomapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcomAppApplication.class, args);
        System.out.println("EcomAppApplication started");
        System.out.println("MongoDB Connected Successfully");
    }

}
