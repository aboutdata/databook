/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.admin.bean;

import com.anhao.admin.api.AdminService;
import com.anhao.admin.domain.dao.AdminDao;
import com.anhao.admin.domain.dao.RoleMapper;
import com.anhao.admin.model.Admin;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Administrator
 */
public class AdminServiceBean implements AdminService {
    
    private Logger logger = LoggerFactory.getLogger(getClass());
    
    @Resource
    private RoleMapper roleMapper;
    
    @Resource
    private AdminDao adminDao;
    
    @Override
    public void create(Admin admin) {
        logger.info("persist admin {}", admin);
        adminDao.create(admin);
    }
    
}
