/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.config;

import com.anhao.config.system.SystemConfig;

/**
 *
 * @author Administrator
 */
public interface ConfigService {

    public String get();

    public SystemConfig getSystemConfig();
}
