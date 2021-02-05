package com.qinshi.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;

@Configuration//@Configuration 注释的类 类似于于一个 xml 配置文件的存在
public class CorsConfig {

    //@Bean是一个方法级别上上的注解，主要用在@Configuration注解的类中，也可以用在@Component注解的类里。相当于bean的id方法名
    @Bean  // https://www.cnblogs.com/feiyu127/p/7700090.html
    public CorsWebFilter corsWebFilter(){

        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("http://localhost:1000");//允许跨域请求的路径
        config.addAllowedOrigin("http://127.0.0.1:1000");
        config.addAllowedHeader("*");//允许携带的头信息
        config.setAllowCredentials(true);//是否允许携带cookie
        config.addAllowedMethod("*");//允许那些请求方式跨域访问

        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        //配置可以访问的地址     注册cores配置
        configurationSource.registerCorsConfiguration("/**",config);
        return new CorsWebFilter(configurationSource);
    }
}
