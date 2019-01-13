package com.sunyard.dubbo.provider.service;


import com.sunyard.dubbo.api.UserServiceBo;

/**
 * Created by Administrator on 2019/1/12.
 */
public class UserServiceImpl implements UserServiceBo {
    @Override
    public String sayHello(String s) {
        System.out.println("-----service invoked!-----");
        return "Hello"+s;
    }
}
