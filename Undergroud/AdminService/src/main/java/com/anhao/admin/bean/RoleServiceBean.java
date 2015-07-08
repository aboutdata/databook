/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.admin.bean;

import com.anhao.admin.api.RoleService;
import com.anhao.domain.Role;
import com.anhao.domain.dao.RoleMapper;
import java.util.Date;
import javax.annotation.Resource;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Administrator
 */
public class RoleServiceBean implements RoleService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private RoleMapper roleMapper;

    @Override
    public void get() {
        System.out.println("RoleServiceBean ..................");

        Role role = new Role();

        String randomId = RandomStringUtils.randomNumeric(10);

        logger.debug("randomId :{}", randomId);
        role.setId(randomId);

        role.setCreateDate(new Date());
        role.setModifyDate(new Date());
        role.setIsSystem(Boolean.TRUE);
        role.setDescription("Description" + RandomStringUtils.randomNumeric(5));
        role.setName("iam insert role " + RandomStringUtils.randomNumeric(5));
        role.setValue("ROLE_ADMIN");
        roleMapper.create(role);
    }

}
