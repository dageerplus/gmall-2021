package com.qinshi.gmall.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
@RefreshScope
@MapperScan("com.qinshi.gmall.pms.dao")
public class GmallPmsApplication {

    public static void main(String[] args){
        SpringApplication.run(GmallPmsApplication.class, args);
    }
}
