package com.cxytiandi.sharding.service.impl;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cxytiandi.sharding.po.RegionConfig;
import com.cxytiandi.sharding.repository.RegionConfigMapper;
import com.cxytiandi.sharding.service.IRegionService;
import com.google.common.collect.Lists;

@Service
public class RegionServiceImpl implements IRegionService {

    private AtomicLong ID = new AtomicLong();

    @Autowired
    private RegionConfigMapper regionConfigMapper;

    @PostConstruct
    public void init() {
        Long lastId = regionConfigMapper.getLastId();
        ID.set(lastId == null ? 1 : lastId);
    }

    @Override
    public void initRegion() {
        List<String> regionNames = Lists.newArrayList("东城区", "西城区", "朝阳区", "海淀区");
        RegionConfig regionConfig = new RegionConfig();
        long pid = ID.getAndIncrement();
        regionConfig.setId(pid);
        regionConfig.setCreateTime(new Date());
        regionConfig.setLevel(0);
        regionConfig.setParentRegionCode("");
        regionConfig.setRegionCode("100000");
        regionConfig.setRegionName("北京市");
        regionConfig.setStatus(0);
        regionConfigMapper.insertSelective(regionConfig);

        for (int i = 0; i < regionNames.size(); i++) {
            long id = ID.getAndIncrement();
            regionConfig.setId(id);
            regionConfig.setCreateTime(new Date());
            regionConfig.setLevel(1);
            regionConfig.setParentRegionCode("");
            regionConfig.setRegionCode("10000" + i);
            regionConfig.setRegionName(regionNames.get(i));
            regionConfig.setStatus(0);
            regionConfig.setParentRegionCode("100000");
            regionConfigMapper.insertSelective(regionConfig);
        }
    }

}
