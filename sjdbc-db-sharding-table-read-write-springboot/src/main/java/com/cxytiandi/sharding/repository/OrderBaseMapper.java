package com.cxytiandi.sharding.repository;

import com.cxytiandi.sharding.po.OrderBase;

public interface OrderBaseMapper {
    int insert(OrderBase record);

    int insertSelective(OrderBase record);

    OrderBase selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderBase record);

    int updateByPrimaryKey(OrderBase record);
}