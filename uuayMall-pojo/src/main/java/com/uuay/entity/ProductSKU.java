package com.uuay.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * ProductSKU
 */
@Data
@Builder
public class ProductSKU {
    Long id;

    Long productId;

    String skuCode;

    String specData;

    BigDecimal price;

    Long stock;

    Long lockedStock;

    Long sales;

    Integer status;

    LocalDateTime createTime;
    
    LocalDateTime updateTime;
}
