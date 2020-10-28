package com.cxytiandi.sharding.po;

import java.util.Date;

/**
 * @author guanzhisong
 * @date 2020-10-28 19:24:54
 */
public class UserOrderMapping implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 订单号
     */
    private Long orderId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间戳
     */
    private Date timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}