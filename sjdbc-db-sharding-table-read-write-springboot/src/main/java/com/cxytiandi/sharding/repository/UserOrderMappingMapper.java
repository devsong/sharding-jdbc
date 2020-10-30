package com.cxytiandi.sharding.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cxytiandi.sharding.po.UserOrderMapping;

public interface UserOrderMappingMapper {
    int insert(UserOrderMapping record);

    int insertSelective(UserOrderMapping record);

    UserOrderMapping selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(UserOrderMapping record);

    int updateByPrimaryKey(UserOrderMapping record);

    @Select("select order_id from t_user_order_mapping where user_id=#{userId} order by order_id desc limit #{pageSize}")
    List<Long> getUserOids(@Param("userId") long userId, @Param("pageSize") int pageSize);
}