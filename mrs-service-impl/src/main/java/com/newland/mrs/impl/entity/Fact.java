package com.newland.mrs.impl.entity;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Face
 * 事实类存储
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-28 16:49
 **/
public class Fact {

    private Map<String, Object> factMap = new HashMap<>();

    public Map<String, Object> getFactMap() {
        return factMap;
    }

    public void setFactMap(Map<String, Object> factMap) {
        this.factMap = factMap;
    }

    public static Fact makeFactMap(Object object) throws IllegalAccessException {
        Fact fact = new Fact();
        Map<String, Object> paramDataMap = new HashMap<>(16);
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (!"serialVersionUID".equals(field.getName()) && field.get(object) != null) {
                if (field.get(object) instanceof Date) {
                    Date date = (Date) field.get(object);
                    paramDataMap.put(field.getName(), date.getTime());
                } else {
                    paramDataMap.put(field.getName(), field.get(object));
                }
            }
        }
        fact.setFactMap(paramDataMap);
        return fact;
    }
}
