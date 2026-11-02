package com.uuay.entity;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * AdminUser
 */
@Data
@Builder
public class AdminUser {
    Long id;

    String username;

    String passwordHash;

    String nickname;

    Integer status;

    LocalDateTime lastLoginTime;

    LocalDateTime createTime;
    
    LocalDateTime updateTime;
}
