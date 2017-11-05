package com.mzcm.pcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by jiangxiaojie on 2017/11/4.
 */
@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}