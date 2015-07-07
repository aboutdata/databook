package com.anhao.domain.dao;

import com.anhao.domain.Role;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface RoleMapper extends BaseMapper<Role, String> {
    //public int countAll();
    //public Role findById(String id);

    public void create(Role role);

    public List<Role> findAll();
}
