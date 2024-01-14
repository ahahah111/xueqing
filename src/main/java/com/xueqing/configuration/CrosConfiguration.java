package com.xueqing.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CrosConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") //配置可以被跨域的路径
                .allowedOriginPatterns("*")
                .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")//允许输入参数的请求方法访问该跨域资源服务器
                .allowCredentials(true)
                .maxAge(3600)                 //时间周期3600s
                .allowedHeaders("*");         //允许所有的请求header访问
    }

}
