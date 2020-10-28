package com.cxytiandi.sharding.repository;

import com.cxytiandi.sharding.po.RegionConfig;

public interface RegionConfigMapper {
    int insert(RegionConfig record);

    int insertSelective(RegionConfig record);

    RegionConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegionConfig record);

    int updateByPrimaryKey(RegionConfig record);
}