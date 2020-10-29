package com.cxytiandi.sharding.po;

import java.util.Date;
import lombok.Data;

/**
 * @author guanzhisong
 * @date 2020-10-29 17:01:59
 */
@Data
public class OrderBase implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 订单号
     */
    private Long orderId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 下单区域
     */
    private String regionCode;

    /**
     * 纬度
     */
    private String lat;

    /**
     * 经度
     */
    private String lng;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间戳
     */
    private Date timestamp;
}