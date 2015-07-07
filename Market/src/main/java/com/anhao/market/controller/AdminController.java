/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.market.controller;

import com.anhao.admin.api.RoleService;
import com.anhao.config.ConfigService;
import com.anhao.config.system.SystemConfig;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
}
