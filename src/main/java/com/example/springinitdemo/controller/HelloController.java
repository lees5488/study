package com.example.springinitdemo.controller;

import com.example.springinitdemo.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

  @Resource
  HelloService helloService;

  @RequestMapping("/")
  public String say(){
    return helloService.hello();
  }
}
