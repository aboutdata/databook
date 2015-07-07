/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.config.system;

import com.anhao.common.BaseObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 系统功能是否开启特性
 *
 * @author youyou
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Features extends BaseObject {

    /**
     * 用户信息是否显示完整 实际情况是开发这模式需要开启此项 设置flase
     *
     */
    @XmlElement
    @Getter
    private boolean dimPrivacy = true;  //默认值

}
