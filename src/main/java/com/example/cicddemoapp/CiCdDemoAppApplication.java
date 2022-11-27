package com.example.cicddemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiCdDemoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CiCdDemoAppApplication.class, args);
        System.out.println("Welcome");
    }

}
