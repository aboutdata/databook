/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.market.controller;

import com.anhao.admin.api.AdminService;
import com.anhao.admin.api.RoleService;
import com.anhao.admin.model.Admin;
import com.anhao.config.ConfigService;
import com.anhao.config.system.SystemConfig;
import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("admin")
public class AdminController {

    @Resource
    ConfigService configService;

    @Resource
    RoleService roleService;

    @Resource
    AdminService adminService;

    @RequestMapping("list.do")
    public String displayAdminList(HttpServletRequest request) {
        String result = configService.get();
        roleService.get();
        SystemConfig config = configService.getSystemConfig();

        System.out.println("config" + config.getDefaultPassword());
        System.out.println("$######################displayAdminList");
        System.out.println("$######################result" + result);
        return "list";
    }

    @RequestMapping("create.do")
    public String createAdmin(HttpServletRequest request) {
        Admin admin = new Admin();
        String randomId = RandomStringUtils.randomNumeric(10);

        admin.setId(randomId);
        admin.setCreateDate(new Date());
        admin.setDepartment("计算机");
        admin.setEmail("845885222@qq.com");
        admin.setIsEnabled(Boolean.TRUE);
        admin.setIsLocked(Boolean.FALSE);
        admin.setLockedDate(new Date());
        admin.setLoginDate(new Date());
        admin.setLoginFailureCount(Integer.MIN_VALUE);
        admin.setLoginIp(randomId);

        admin.setModifyDate(new Date());
        admin.setName(RandomStringUtils.randomNumeric(5));
        admin.setPassword(RandomStringUtils.randomNumeric(5));
        admin.setUsername(RandomStringUtils.randomNumeric(8));
        adminService.create(admin);
        return "list";
    }
}
