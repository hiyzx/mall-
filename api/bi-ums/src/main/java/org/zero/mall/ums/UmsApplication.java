package org.zero.mall.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yezhaoxing
 * @since 2018/08/30
 */
@SpringBootApplication
@MapperScan("org.zero.mall.ums.mapper")
public class UmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UmsApplication.class, args);
    }
}
