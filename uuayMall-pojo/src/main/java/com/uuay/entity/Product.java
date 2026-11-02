package com.uuay.entity;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * Product
 */
@Data
@Builder
public class Product {
    Long id;

    Long merchantId;

    Long categoryId;

    String name;

    String subtitle;

    String mainImage;

    String detail;

    Integer status;

    Long totalSales;

    LocalDateTime createTime;
    
    LocalDateTime updateTime;
}
