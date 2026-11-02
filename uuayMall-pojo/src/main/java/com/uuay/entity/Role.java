package com.uuay.entity;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * Role
 */
@Data
@Builder
public class Role {
    Long id;

    String name;

    String code;

    String description;
    
    LocalDateTime createTime;
}
