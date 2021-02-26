package com.newland.mrs.impl;

import com.google.common.collect.Lists;
import com.newland.mrs.impl.entity.Fact;
import com.newland.mrs.impl.util.SpringContextUtil;
import org.kie.api.runtime.KieSession;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * MrsServiceApplication
 * 资金路由系统启动
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-26 12:01
 **/
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@MapperScan(basePackages ={"com.newland.mrs.persist.mapper", "com.newland.mrs.impl.service.dao"})
public class MrsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MrsServiceApplication.class, args);
//        KieSession kieSession = SpringContextUtil.getBean(KieSession.class);
//        Fact fact = new Fact();
//        fact.getFactMap().put("applyCrowd", "上海");
//        fact.getFactMap().put("stringList", "上海, 广州, 北京");
//        kieSession.insert(fact);
//        int a = kieSession.fireAllRules();
//        System.out.println("匹配不上海了" + a);
//        User user = new User(9, "张三");
//        RuleCheckResult result = new RuleCheckResult();
//        kieSession.insert(user);
//        kieSession.insert(result);
//        int a = kieSession.fireAllRules();
//        System.out.println(a);
//        System.out.println(result.getResultMap().size());
//        System.exit(0);
    }
}
