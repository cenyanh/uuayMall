package com.uuay.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * Orders
 */
@Data
@Builder
public class Orders {
    Long id;

    String orderNo;

    Long userId;

    BigDecimal totalAmount;

    BigDecimal payAmount;

    Integer status;

    String receiverName;

    String receiverPhone;

    String receiverProvince;

    String receiverCity;

    String receiverDistrict;

    String receiverDetail;

    LocalDateTime payTime;
    
    LocalDateTime cancelTime;
    
    LocalDateTime finishTime;
    
    LocalDateTime createTime;
    
    LocalDateTime updateTime;
}
