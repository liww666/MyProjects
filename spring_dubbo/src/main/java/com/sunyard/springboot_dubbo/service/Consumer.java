package com.sunyard.springboot_dubbo.service;

import com.sunyard.dubbodemo.sdk.UserServiceBo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/1/12.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:consumer.xml"});
        context.start();
        UserServiceBo userServiceBo=context.getBean(UserServiceBo.class);
        System.out.println(userServiceBo.sayHello(" dubbo"));
        System.in.read(); // 按任意键退出
    }
}
