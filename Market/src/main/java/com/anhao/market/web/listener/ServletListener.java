/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.market.web.listener;

import com.anhao.config.ConfigService;
import com.anhao.config.system.SystemConfig;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 *
 * @author Administrator
 */
@WebListener
public class ServletListener implements ServletContextListener, HttpSessionListener {
    
    Logger logger = LoggerFactory.getLogger(ServletListener.class);
    private WebApplicationContext springContext;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("ServletListener Starting...");
        springContext = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
        //start
        ServletContext sc = sce.getServletContext();
        //放入系统信息
        ConfigService configService = (ConfigService) springContext.getBean("configService");
        logger.info("this is config {}", configService.getSystemConfig());
        sc.setAttribute("systemName", "互联网医疗云平台");
        sc.setAttribute("systemConfig", configService.getSystemConfig());
        logger.info("ServletListener Started now");
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
    
    @Override
    public void sessionCreated(HttpSessionEvent se) {
    }
    
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
    
}
