package com.newland.mrs.impl.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * SerializeUtil
 *
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-28 15:15
 **/
public class SerializeUtil {

    public static byte[] serialize(Object object){
        ObjectOutputStream oos = null;
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            return baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(baos != null){
                    baos.close();
                }
                if (oos != null) {
                    oos.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static Object deserialize(byte[] bytes){
        ByteArrayInputStream bas = null;
        ObjectInputStream ois = null;
        try{
            bas = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bas);
            return ois.readObject();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (bas != null) {
                    bas.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

}
