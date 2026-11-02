package com.uuay.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * UserInfo
 */
@Data
@Builder
public class UserInfo {
    Long id;

    Long userId;

    String nickname;

    String avatar;

    Integer gender;

    LocalDate birthday;

    LocalDateTime createTime;
    
    LocalDateTime updateTime;
}
