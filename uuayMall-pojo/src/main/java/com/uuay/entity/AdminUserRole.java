package com.uuay.entity;

import lombok.Builder;
import lombok.Data;

/**
 * AdminUserRole
 */
@Data
@Builder
public class AdminUserRole {
    Long id;
    
    Long adminId;

    Long roleId;
}
