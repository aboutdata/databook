/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.config;

import com.anhao.config.api.LoaderCofig;
import com.anhao.config.system.SystemConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Administrator
 */
public class ConfigServiceBean implements ConfigService {

    private static final String DEFAULT_CONFIG_DIR = "/var/AnHao/config/";
    private JAXBContext context;
    private Unmarshaller unmarshaller;

    @Resource
    LoaderCofig loaderCofig;

    @PostConstruct
    void init() {

    }

    @Override
    public String get() {
        loaderCofig.load();
        return "i  am dubbo demo  server11111111111111111";
    }

    /**
     * 系统配置
     *
     * @return
     */
    @Override
    public SystemConfig getSystemConfig() {
        return (SystemConfig) loadConfig(SystemConfig.class);
    }

    //加载
    private BaseConfig loadConfig(Class clazz) {
        BaseConfig result = null;

        try {
            this.context = JAXBContext.newInstance(new Class[]{SystemConfig.class});
            this.unmarshaller = this.context.createUnmarshaller();
        } catch (Exception ex) {
//            this.logger.error("Error init JAXB env", ex);
        }

        String className = clazz.getName();
        try {
            String configName = (String) clazz.getField("CONFIG_NAME").get(null);
            try {
                Reader reader = loadConfig(configName);
                Throwable localThrowable2 = null;
                try {
                    result = (BaseConfig) this.unmarshaller.unmarshal(reader);
                    result.setLastUpdate(System.currentTimeMillis());
                    result.setLastModified(getLastModified(configName));
                } catch (Throwable localThrowable1) {
                    localThrowable2 = localThrowable1;
                    throw localThrowable1;
                } finally {
                    if (reader != null) {
                        if (localThrowable2 != null) {
                            try {
                                reader.close();
                            } catch (Throwable x2) {
                                localThrowable2.addSuppressed(x2);
                            }
                        } else {
                            reader.close();
                        }
                    }
                }
            } catch (IOException ex) {
//                this.logger.error("Cannot get Reader for " + className, ex);
            } catch (JAXBException ex) {
//                this.logger.error("Cannot unmarshall the " + className + ", check config content.", ex);
            }
        } catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException ex) {
//            this.logger.error("Config class " + className + " may not have CONFIG_NAME as public static field.", ex);
        }
        return result;
    }

    public Reader loadConfig(String configName) throws IOException {
        String configFileName = getConfigFilename(configName);
        File configFile = new File(configFileName);
        if ((configFile.exists()) && (configFile.canRead())) {
            return new FileReader(configFile);
        }
        throw new FileNotFoundException(configFileName);
    }

    public long getLastModified(String configName) {
        String configFileName = getConfigFilename(configName);
        File configFile = new File(configFileName);
        if ((configFile.exists()) && (configFile.canRead())) {
            return configFile.lastModified();
        }
        return -1L;
    }

    private String getConfigFilename(String configName) {
        return DEFAULT_CONFIG_DIR + configName + ".xml";
    }

}
