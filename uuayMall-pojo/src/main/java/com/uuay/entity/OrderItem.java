package com.uuay.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * OrderItem
 */
@Data
@Builder
public class OrderItem {
    Long id;

    Long orderId;

    Long productId;

    Long skuId;
    
    String productName;

    String skuSpec;

    String productImage;

    BigDecimal price;

    Integer quantity;

    BigDecimal totalAmount;
    
    LocalDateTime createTime;
}
