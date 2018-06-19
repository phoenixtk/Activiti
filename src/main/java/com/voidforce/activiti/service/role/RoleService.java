package com.voidforce.activiti.service.role;

import com.voidforce.activiti.bean.Role;

import java.util.List;

public interface RoleService {
    Long insert(Role role);

    Role getById(Long roleId);

    Role getByName(String name);
}
