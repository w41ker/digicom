package com.digicom.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.digicom"})
public class Digicom {
    public static void main(String[] args) {
        SpringApplication.run(Digicom.class, args);
    }
}