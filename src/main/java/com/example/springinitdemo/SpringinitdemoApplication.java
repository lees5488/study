package com.example.springinitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration
@ImportResource(value = {"classpath:dubbo-providers.xml"})
public class SpringinitdemoApplication {
  public static void main(String[] args) {
	SpringApplication.run(SpringinitdemoApplication.class, args);
  }
}

