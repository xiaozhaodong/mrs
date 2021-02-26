package com.newland.mrs.impl.config.db;

import com.alibaba.druid.filter.config.ConfigTools;
import org.apache.commons.lang3.StringUtils;

import java.util.Properties;

/**
 * DruidPasswordCallback
 * 密码处理
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020/11/10 10:22 上午
 */
public class DruidPasswordCallback extends com.alibaba.druid.util.DruidPasswordCallback {

    private static final long serialVersionUID = -2421463127549699628L;

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        String password = properties.getProperty("password");
        String decryptKey = properties.getProperty("decryptKey");
        try {
            String decryptPassword;
            if (StringUtils.isEmpty(decryptKey)) {
                decryptPassword = ConfigTools.decrypt(password);
            } else {
                decryptPassword = ConfigTools.decrypt(decryptKey, password);
            }
            setPassword(decryptPassword.toCharArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
