package com.uuay.entity;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * Cart
 */
@Data
@Builder
public class Cart {
    Long id;
    
    Long userId;

    Long skuId;
    
    Integer quantity;
    
    Integer selected;
    
    LocalDateTime createTime;
    
    LocalDateTime updateTime;
}
