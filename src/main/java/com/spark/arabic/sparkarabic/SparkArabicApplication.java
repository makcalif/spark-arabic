package com.spark.arabic.sparkarabic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.spark.arabic")
public class SparkArabicApplication {


	public static void main(String[] args) {
		SpringApplication.run(SparkArabicApplication.class, args);
	}


}
