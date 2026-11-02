package com.uuay.entity;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * Users
 */
@Data
@Builder
public class Users {
    Long id;

    String username;

    String passwordHash;

    String phone;

    String email;

    Integer status;

    LocalDateTime createTime;
    
    LocalDateTime updateTime;
}
