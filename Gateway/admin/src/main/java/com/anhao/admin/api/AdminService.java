/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.admin.api;

import com.anhao.admin.model.Admin;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface AdminService {

    public void create(Admin admin);

    public List<Admin> findAll();

    public Admin findById(String id);
}
