package com.cxytiandi.sharding.po;

import java.util.Date;
import lombok.Data;

/**
 * @author guanzhisong
 * @date 2020-10-29 17:01:59
 */
@Data
public class SysConfig implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private Long id;

    /**
     * 配置键
     */
    private String sysKey;

    /**
     * 配置值
     */
    private String sysVal;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间戳
     */
    private Date timestamp;
}