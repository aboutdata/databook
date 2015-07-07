/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.config.system;

import com.anhao.config.BaseConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 系统配置信息
 *
 * @author youyou
 */
@XmlRootElement(name = "SystemConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public final class SystemConfig extends BaseConfig {

    public static final String CONFIG_NAME = "SystemConfig";

    /**
     * *
     * 是否是开发这模式
     */
    @XmlElement(required = true)
    private boolean developMode;

    //后台用户开户默认密码，如果为null表示使用手机短信发送随机密码
    @XmlElement
    private String defaultPassword = "123456";
    /**
     * 各平台通用功能
     */
    @XmlElement(required = false)
    private Features features;

    //setter and geeter
    public boolean isDevelopMode() {
        return developMode;
    }

    public void setDevelopMode(boolean developMode) {
        this.developMode = developMode;
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }

    public void setDefaultPassword(String defaultPassword) {
        this.defaultPassword = defaultPassword;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "SystemConfig{" + "developMode=" + developMode + ", defaultPassword=" + defaultPassword + ", features=" + features + '}';
    }

}
