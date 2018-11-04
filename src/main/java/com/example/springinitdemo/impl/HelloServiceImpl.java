package com.example.springinitdemo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.springinitdemo.service.HelloService;

@Service(version = "1.0.0", interfaceClass = HelloService.class, timeout = 300000)
public class HelloServiceImpl implements HelloService {
  @Override
  public String hello() {
	return "Hello World !!!~~~~~~~~~~~~~~";
  }
}
