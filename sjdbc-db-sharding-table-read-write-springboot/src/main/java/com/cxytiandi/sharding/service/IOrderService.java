package com.cxytiandi.sharding.service;

import java.util.List;

import com.cxytiandi.sharding.po.OrderBase;

public interface IOrderService {
    public Object createOrder(long orderId);

    public List<OrderBase> queryOrders(long userId, int pageSize);
}
