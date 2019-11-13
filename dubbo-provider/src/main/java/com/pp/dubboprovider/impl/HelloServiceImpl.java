package com.pp.dubboprovider.impl;


import com.alibaba.dubbo.config.annotation.Service;
import service.HelloService;

/**
* @author: DoubleP
* @Date: 2019/11/13 10:04
* @Description: 这是实现
*/
@Service(loadbalance = "")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("letme");
      return "hello" + name;
    }


}
