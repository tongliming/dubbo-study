package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @program: dubbo-study
 * @description: Dubbo服务端
 * @author: T.LM
 * @date: 2023-03-08 21:51
 **/
@SpringBootApplication
@ImportResource(locations = "classpath:applicationContext-dubbo.xml")
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class);

    }
}
