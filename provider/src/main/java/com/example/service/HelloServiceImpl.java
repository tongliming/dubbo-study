package com.example.service;

/**
 * @program: dubbo-study
 * @description: 接口实现
 * @author: T.LM
 * @date: 2023-03-08 21:58
 **/
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
