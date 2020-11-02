package com.cxytiandi.sharding.service;

import java.util.List;

import com.cxytiandi.sharding.po.OrderBase;

public interface IOrderService {
    /**
     * 创建订单
     * @param orderId
     * @return
     */
    public Object createOrder(long orderId);

    /**
     * 查询订单,订单号查询
     * @param oid
     * @return
     */
    public OrderBase queryOrder(Long oid);

    /**
     * 查询订单,批量查询订单
     * @param oids
     * @return
     */
    public List<OrderBase> queryOrders(List<Long> oids);

    /**
     * 查询订单,用户ID查询
     * @param userId
     * @param pageSize
     * @return
     */
    public List<OrderBase> queryOrders(long userId, int pageSize);
}
