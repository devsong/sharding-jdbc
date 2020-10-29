package com.cxytiandi.sharding.po;

import java.util.Date;
import lombok.Data;

/**
 * @author guanzhisong
 * @date 2020-10-29 19:18:34
 */
@Data
public class OrderItem implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private Long id;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 产品ID
     */
    private String productId;

    /**
     * 产品名
     */
    private String productName;

    /**
     * 产品数量
     */
    private Integer productNum;

    /**
     * 以分为单位
     */
    private Integer productPrice;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date timestamp;
}