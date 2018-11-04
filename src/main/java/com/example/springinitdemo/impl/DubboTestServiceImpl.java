package com.example.springinitdemo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.springinitdemo.service.DubboService;

@Service(version = "1.0.0", interfaceClass = DubboService.class, timeout = 300000)
public class DubboTestServiceImpl implements DubboService {
  @Override
  public String test() {
	return null;
  }
}
