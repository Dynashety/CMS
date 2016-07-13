package com.zizo.object;

import com.google.gson.internal.Streams;
import org.apache.commons.io.IOUtils;
import org.springframework.util.DigestUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by dengy on 2016/6/27.
 * 采用MD5加密解密
 * @author d
 * @datetime 2016-05-02
 */
public class MD5Util {
    /***
     * MD5加码 生成32位md5码
     */
    public static String MD5(String s) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String DigestUtils2MD5(String fis) throws IOException {
        return DigestUtils.md5DigestAsHex(fis.getBytes());
    }

    public static String DigestUtils2MD5(byte[] b) throws IOException {
        return DigestUtils.md5DigestAsHex(b);
    }
}