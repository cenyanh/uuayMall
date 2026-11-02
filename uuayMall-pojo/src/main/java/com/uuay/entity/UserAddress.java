package com.uuay.entity;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * UserAddress
 */
@Data
@Builder
public class UserAddress {
    Long id;

    Long userId;

    String receiverName;

    String receiverPhone;

    String province;

    String city;

    String district;

    String detail;

    Integer isDefault;

    LocalDateTime createTime;
    
    LocalDateTime updateTime;
}
