package com.cxytiandi.sharding.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cxytiandi.sharding.po.OrderBase;
import com.cxytiandi.sharding.po.OrderItem;
import com.cxytiandi.sharding.po.UserOrderMapping;
import com.cxytiandi.sharding.repository.OrderBaseMapper;
import com.cxytiandi.sharding.repository.OrderItemMapper;
import com.cxytiandi.sharding.repository.UserOrderMappingMapper;
import com.cxytiandi.sharding.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Autowired
    private OrderBaseMapper orderBaseMapper;

    @Autowired
    private UserOrderMappingMapper userOrderMappingMapper;

    @Override
    @Transactional
    public Object createOrder(long orderId) {
        OrderBase orderBase = new OrderBase();
        orderBase.setOrderId(orderId);
        orderBase.setCreateTime(new Date());
        orderBase.setLat("lat");
        orderBase.setLng("lng");
        orderBase.setMobile("1820");
        orderBase.setOrderStatus(0);
        orderBase.setRegionCode("10000" + new Random().nextInt(10) % 4);
        orderBase.setUserId(orderId % 10);
        orderBase.setUserName("username-" + orderBase.getUserId());

        orderBaseMapper.insertSelective(orderBase);

        OrderItem orderItem = new OrderItem();
        orderItem.setCreateTime(new Date());
        orderItem.setOrderId(orderId);
        orderItem.setProductId(orderId % 5 + "");
        orderItem.setProductName("productName-" + orderItem.getProductId());
        orderItem.setProductNum(1);
        orderItem.setProductPrice(100);

        orderItemMapper.insertSelective(orderItem);

        UserOrderMapping userOrderMapping = new UserOrderMapping();
        userOrderMapping.setCreateTime(new Date());
        userOrderMapping.setOrderId(orderId);
        userOrderMapping.setTimestamp(new Date());
        userOrderMapping.setUserId(orderBase.getUserId());

        userOrderMappingMapper.insertSelective(userOrderMapping);

        return "success";
    }

    @Override
    public List<OrderBase> queryOrders(long userId, int pageSize) {
        List<Long> orderIds = userOrderMappingMapper.getUserOids(userId, pageSize);
        List<OrderBase> orderBases = orderBaseMapper.getGetOrderBase(orderIds);
        return orderBases;
    }

}
