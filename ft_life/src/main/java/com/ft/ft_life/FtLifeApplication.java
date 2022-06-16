package com.ft.ft_life;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.ft")
@SpringBootApplication
public class FtLifeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FtLifeApplication.class, args);
    }

}
