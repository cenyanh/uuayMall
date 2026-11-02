package com.uuay.entity;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * MerchantUser
 */
@Data
@Builder
public class MerchantUser {
    Long id;

    Long merchantId;

    String username;

    String passwordHash;

    String nickname;

    Integer role;

    Integer status;

    LocalDateTime createTime;
}
