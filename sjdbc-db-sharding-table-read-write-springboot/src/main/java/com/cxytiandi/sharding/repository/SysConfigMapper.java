package com.cxytiandi.sharding.repository;

import org.apache.ibatis.annotations.Select;

import com.cxytiandi.sharding.po.SysConfig;

public interface SysConfigMapper {
    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    SysConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);

    @Select("select id from t_region_config order by id desc limit 1")
    Long getLastId();
}