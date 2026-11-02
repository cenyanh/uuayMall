package com.uuay.entity;

import lombok.Builder;
import lombok.Data;

/**
 * RolePermission
 */
@Data
@Builder
public class RolePermission {
    Long id;

    Long roleId;
    
    Long permissionId;
}
