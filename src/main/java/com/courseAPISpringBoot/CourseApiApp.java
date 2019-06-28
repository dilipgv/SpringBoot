package com.courseAPISpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.courseAPISpringBoot","com.courseAPI.topic"} )
public class CourseApiApp {

    public static void main( String[] args){
        SpringApplication.run(CourseApiApp.class, args);
    }
}
