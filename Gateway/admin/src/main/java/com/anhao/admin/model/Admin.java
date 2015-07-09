/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.admin.model;

import com.anhao.common.entity.ABaseEntity;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class Admin extends ABaseEntity {

    /**
     * sql colum username, password,email,
     * name,department,isEnabled,isLocked,loginFailureCount,lockedDate,loginDate,loginIp;
     */
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * E-mail
     */
    private String email;

    /**
     * 姓名
     */
    private String name;

    /**
     * 部门
     */
    private String department;

    /**
     * 是否启用
     */
    private Boolean isEnabled;

    /**
     * 是否锁定
     */
    private Boolean isLocked;

    /**
     * 连续登录失败次数
     */
    private Integer loginFailureCount;

    /**
     * 锁定日期
     */
    private Date lockedDate;

    /**
     * 最后登录日期
     */
    private Date loginDate;

    /**
     * 最后登录IP
     */
    private String loginIp;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean isIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean isIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    public Date getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Override
    public String toString() {
        return "Admin{" + "username=" + username + ", password=" + password + ", email=" + email + ", name=" + name + ", department=" + department + ", isEnabled=" + isEnabled + ", isLocked=" + isLocked + ", loginFailureCount=" + loginFailureCount + ", lockedDate=" + lockedDate + ", loginDate=" + loginDate + ", loginIp=" + loginIp + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.username);
        hash = 41 * hash + Objects.hashCode(this.password);
        hash = 41 * hash + Objects.hashCode(this.email);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.department);
        hash = 41 * hash + Objects.hashCode(this.isEnabled);
        hash = 41 * hash + Objects.hashCode(this.isLocked);
        hash = 41 * hash + Objects.hashCode(this.loginFailureCount);
        hash = 41 * hash + Objects.hashCode(this.lockedDate);
        hash = 41 * hash + Objects.hashCode(this.loginDate);
        hash = 41 * hash + Objects.hashCode(this.loginIp);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Admin other = (Admin) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.department, other.department)) {
            return false;
        }
        if (!Objects.equals(this.isEnabled, other.isEnabled)) {
            return false;
        }
        if (!Objects.equals(this.isLocked, other.isLocked)) {
            return false;
        }
        if (!Objects.equals(this.loginFailureCount, other.loginFailureCount)) {
            return false;
        }
        if (!Objects.equals(this.lockedDate, other.lockedDate)) {
            return false;
        }
        if (!Objects.equals(this.loginDate, other.loginDate)) {
            return false;
        }
        if (!Objects.equals(this.loginIp, other.loginIp)) {
            return false;
        }
        return true;
    }

}
