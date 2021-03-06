package com.cxytiandi.sharding.po;

import java.util.Date;
import lombok.Data;

/**
 * @author guanzhisong
 * @date 2020-10-29 17:01:59
 */
@Data
public class RegionConfig implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private Long id;

    /**
     * 区域code码
     */
    private String regionCode;

    /**
     * 区域名
     */
    private String regionName;

    /**
     * 区域级别
     */
    private Integer level;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 父区域Code码
     */
    private String parentRegionCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date timestamp;
}