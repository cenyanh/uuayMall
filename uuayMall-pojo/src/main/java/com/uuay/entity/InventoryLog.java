package com.uuay.entity;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * InventoryLog
 */
@Data
@Builder
public class InventoryLog {
    Long id;
    
    Long skuId;

    Long orderId;

    Integer changeType;

    Long changeQuantity;

    Long beforeStock;

    Long afterStock;

    String remark;

    LocalDateTime createTime;
}
