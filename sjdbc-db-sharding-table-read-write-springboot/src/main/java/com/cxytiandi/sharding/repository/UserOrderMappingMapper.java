package com.cxytiandi.sharding.repository;

import com.cxytiandi.sharding.po.UserOrderMapping;

public interface UserOrderMappingMapper {
    int insert(UserOrderMapping record);

    int insertSelective(UserOrderMapping record);

    UserOrderMapping selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(UserOrderMapping record);

    int updateByPrimaryKey(UserOrderMapping record);
}