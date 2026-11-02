package com.uuay.entity;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * Merchants
 */
@Data
@Builder
public class Merchants {
    Long id;

    String name;

    String logo;

    String description;

    String contactPhone;

    Integer status;

    LocalDateTime createTime;
    
    LocalDateTime updateTime;
}
