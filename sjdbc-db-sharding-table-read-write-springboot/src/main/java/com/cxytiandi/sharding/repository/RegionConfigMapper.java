package com.cxytiandi.sharding.repository;

import org.apache.ibatis.annotations.Select;

import com.cxytiandi.sharding.po.RegionConfig;

public interface RegionConfigMapper {
    int insert(RegionConfig record);

    int insertSelective(RegionConfig record);

    RegionConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RegionConfig record);

    int updateByPrimaryKey(RegionConfig record);

    @Select("select id from t_region_config order by id desc limit 1")
    Long getLastId();
}