package com.qinshi.gmall.pms.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //设置请求页面大于最大页面后操作，true返回首页，false 继续请求 默认为false
        paginationInterceptor.setOverflow(false);

        return paginationInterceptor;
    }
}
