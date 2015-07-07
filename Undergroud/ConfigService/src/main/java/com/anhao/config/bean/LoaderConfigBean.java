/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.config.bean;

import com.anhao.config.api.LoaderCofig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class LoaderConfigBean implements LoaderCofig {

    Logger logger = LoggerFactory.getLogger(LoaderConfigBean.class);

    @Override
    public void load() {
        logger.info("LoaderConfigBean test");
    }

}
