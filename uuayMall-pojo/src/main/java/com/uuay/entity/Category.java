package com.uuay.entity;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * Category
 */
@Data
@Builder
public class Category {
    Long id;

    Long parentId;

    String name;

    Integer sortOrder;

    Integer status;

    LocalDateTime createTime;
    
    LocalDateTime updateTime;
}
