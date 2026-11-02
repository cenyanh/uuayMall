package com.uuay.entity;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * Permission
 */
@Data
@Builder
public class Permission {
    Long id;

    String name;

    String code;

    String description;

    LocalDateTime createTime;
}
