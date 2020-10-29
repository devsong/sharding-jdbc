package com.cxytiandi.sharding.po;

import java.util.Date;
import lombok.Data;

/**
 * @author guanzhisong
 * @date 2020-10-29 19:18:34
 */
@Data
public class UserOrderMapping implements java.io.Serializable {
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
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间戳
     */
    private Date timestamp;
}