package com.mzcm.pcs;

import com.mzcm.pcs.datasource.DynamicDataSourceRegister;
import com.mzcm.pcs.interceptor.SecurityInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by jiangxiaojie on 2017/11/4.
 */
@SpringBootApplication
@Import({DynamicDataSourceRegister.class})
public class Application extends WebMvcConfigurerAdapter {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SecurityInterceptor())
                .addPathPatterns("/**");
    }

}