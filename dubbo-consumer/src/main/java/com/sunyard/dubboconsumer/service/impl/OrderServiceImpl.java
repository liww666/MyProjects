package com.sunyard.dubboconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sunyard.dubboapi.UserServiceBo;
import com.sunyard.dubboconsumer.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/1/13.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Reference
    private UserServiceBo userServiceBo;
    @Override
    public String initOrder(String id) {
        return userServiceBo.sayHello(id);
    }
}
