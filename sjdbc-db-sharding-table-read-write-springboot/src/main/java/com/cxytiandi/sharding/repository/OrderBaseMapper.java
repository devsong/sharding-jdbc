package com.cxytiandi.sharding.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cxytiandi.sharding.po.OrderBase;

public interface OrderBaseMapper {
    int insert(OrderBase record);

    int insertSelective(OrderBase record);

    OrderBase selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderBase record);

    int updateByPrimaryKey(OrderBase record);

    List<OrderBase> getGetOrderBase(@Param("orderIds") List<Long> orderIds);
}