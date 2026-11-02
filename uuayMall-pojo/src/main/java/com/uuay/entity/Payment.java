package com.uuay.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * Payment
 */
@Data
@Builder
public class Payment {
    Long id;

    String paymentNo;

    Long orderId;

    Long userId;

    BigDecimal amount;

    Integer paymentMethod;

    Integer status;

    String transactionNo;

    LocalDateTime payTime;

    LocalDateTime createTime;
    
    LocalDateTime updateTime;
}
