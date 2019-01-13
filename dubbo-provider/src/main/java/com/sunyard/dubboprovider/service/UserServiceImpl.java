package com.sunyard.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sunyard.dubboapi.UserServiceBo;

/**
 * Created by Administrator on 2019/1/13.
 */
//@Service(
//        version = "${demo.service.version}",
//        application = "${dubbo.application.id}",
//        protocol = "${dubbo.protocol.id}",
//        registry = "${dubbo.registry.id}"
//)
@Service
public class UserServiceImpl implements UserServiceBo {
    @Override
    public String sayHello(String s) {
        System.out.println("-----service invoked!-----");
        return "Hello "+s;
    }
}
