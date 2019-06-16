package com.example.zaliczeniewykladu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.zaliczeniewykladu")
public class ZaliczeniewykladuApplication {

    public static void main(String[] args) {

                SpringApplication.run(ZaliczeniewykladuApplication.class, args);

    }

}
