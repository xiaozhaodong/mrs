package com.newland.mrs.impl.config.db;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.sql.DataSource;
import java.util.*;

/**
 * DataSourceConfig
 * 数据源配置
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-01 13:48
 **/
@Configuration
@EnableTransactionManagement
public class DataSourceConfig {

    private final Environment env;

    private final DruidDataSourceProperties properties;

    public DataSourceConfig(Environment env, DruidDataSourceProperties properties) {
        this.env = env;
        this.properties = properties;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        fb.setDataSource(dataSource);
        fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(Objects.requireNonNull(env.getProperty("mybatis.mapper-locations"))));
        fb.setConfigLocation(new PathMatchingResourcePatternResolver().getResource(Objects.requireNonNull(env.getProperty("mybatis.config-location"))));
        return fb.getObject();
    }

    @Bean
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(properties.getDriverClassName());
        druidDataSource.setUrl(properties.getUrl());
        druidDataSource.setUsername(properties.getUsername());
        druidDataSource.setPassword(properties.getPassword());
        druidDataSource.setInitialSize(properties.getInitialSize());
        druidDataSource.setMinIdle(properties.getMinIdle());
        druidDataSource.setMaxActive(properties.getMaxActive());
        druidDataSource.setMaxWait(properties.getMaxWait());
        druidDataSource.setTimeBetweenEvictionRunsMillis(properties.getTimeBetweenEvictionRunsMillis());
        druidDataSource.setMinEvictableIdleTimeMillis(properties.getMinEvictableIdleTimeMillis());
        druidDataSource.setValidationQuery(properties.getValidationQuery());
        druidDataSource.setTestWhileIdle(properties.isTestWhileIdle());
        druidDataSource.setTestOnBorrow(properties.isTestOnBorrow());
        druidDataSource.setTestOnReturn(properties.isTestOnReturn());
        druidDataSource.setPoolPreparedStatements(properties.isPoolPreparedStatements());
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(properties.getMaxPoolPreparedStatementPerConnectionSize());
        if (properties.isDecrypt()) {
            Properties connectProperties = new Properties();
            connectProperties.setProperty("password", properties.getPassword());
            connectProperties.setProperty("decryptKey",  properties.getDecryptKey());
            druidDataSource.setConnectProperties(connectProperties);
            druidDataSource.setPasswordCallback(new DruidPasswordCallback());
        }
        return druidDataSource;
    }

    @Bean
    public ServletRegistrationBean<Servlet> druidStatViewServlet() {
        ServletRegistrationBean<Servlet> servletRegistrationBean = new ServletRegistrationBean<>(new StatViewServlet(),"/druid/*");
        Map<String, String> initParams = new HashMap<>();
        //　可配的属性都在 StatViewServlet 和其父类下
        initParams.put("loginUsername", "druid");
        initParams.put("loginPassword", "druid");
        servletRegistrationBean.setInitParameters(initParams);
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<Filter> druidWebStatFilter() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>(new WebStatFilter());
        Map<String, String> initParams = new HashMap<>();
        initParams.put("exclusions", "*.js,*.css,/druid/*");
        filterRegistrationBean.setInitParameters(initParams);
        filterRegistrationBean.setUrlPatterns(Collections.singletonList("/*"));
        return filterRegistrationBean;
    }
}
