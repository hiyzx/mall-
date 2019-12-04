package org.zero.mall.ums.service;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;

/**
 * @author yezhaoxing
 * @date 2019/12/3
 */
public class JasyptTest {

    @Test
    public void encrypt() {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐)
        textEncryptor.setPassword("G0CvDz7oJn6");
        //要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("root");
        String password = textEncryptor.encrypt("yzx123456");
        System.out.println("username:" + username);
        System.out.println("password:" + password);
    }
}
