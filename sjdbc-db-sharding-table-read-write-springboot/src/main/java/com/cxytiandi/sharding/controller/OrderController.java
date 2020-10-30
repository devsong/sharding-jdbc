package com.cxytiandi.sharding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cxytiandi.sharding.service.IOrderService;
import com.cxytiandi.sharding.service.IRegionService;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @Autowired
    private IRegionService regionService;

    @RequestMapping("create")
    public Object create() {
        for (int i = 0; i < 100; i++) {
            orderService.createOrder(i + 1);
        }
        return "success";
    }

    @RequestMapping("list/{userId}")
    public Object list(@PathVariable("userId") long userId) {
        return orderService.queryOrders(userId, 10);
    }

    @RequestMapping("init")
    public Object initRegion() {
        regionService.initRegion();
        return "success";
    }
}
