package org.spring.springboot.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/rocketmq-consumer.xml");
        context.registerShutdownHook();
    }
}
