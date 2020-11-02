package com.cxytiandi.sharding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("create")
    public Object create() {
        for (int i = 0; i < 100; i++) {
            orderService.createOrder(i + 1);
        }
        return "success";
    }

    @GetMapping("list/{oid}")
    public Object listOids(@PathVariable Long oid) {
        if (oid == null || oid <= 0) {
            throw new IllegalArgumentException(String.format("oid[%s] must not less than 0", oid));
        }
        return orderService.queryOrder(oid);
    }

    @PostMapping("list/oids")
    public Object listOids(@RequestBody List<Long> oids) {
        if (CollectionUtils.isEmpty(oids)) {
            throw new IllegalArgumentException("oids must not empty");
        }
        return orderService.queryOrders(oids);
    }

    @GetMapping("list/user/{userId}")
    public Object list(@PathVariable("userId") Long userId) {
        if (userId == null || userId <= 0) {
            throw new IllegalArgumentException(String.format("userId[%s] must not less than 0", userId));
        }
        return orderService.queryOrders(userId, 10);
    }

    @RequestMapping("init")
    public Object initRegion() {
        regionService.initRegion();
        return "success";
    }
}
