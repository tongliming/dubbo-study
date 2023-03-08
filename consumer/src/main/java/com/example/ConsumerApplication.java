package com.example;

import com.example.service.HelloService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * @program: dubbo-study
 * @description: Dubbo客户端
 * @author: T.LM
 * @date: 2023-03-08 21:49
 **/
@SpringBootApplication
@ImportResource(locations = "classpath:applicationContext-dubbo.xml")
public class ConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);

        HelloService producerService = context.getBean("helloService", HelloService.class);

        RpcContext.getContext().setAttachment("word","abc");

        String message = "I'm Jiangzh";
        // 正常调用
        System.out.println(producerService.sayHello(message));
    }
}
