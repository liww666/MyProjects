package com.sunyard.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sunyard.dubboconsumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/1/13.
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/initorder")
    public String initOrder(@RequestParam(name="id")String id){
        return orderService.initOrder(id);
    }
}
