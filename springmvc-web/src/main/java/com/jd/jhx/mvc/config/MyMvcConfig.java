package com.jd.jhx.mvc.config;

import com.jd.jhx.mvc.converter.MyMessageConverter;
import com.jd.jhx.mvc.interceptor.DemoInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

/**
 * Created by jihaixiao on 2016/11/23.
 */


@Configuration
@EnableWebMvc
@ComponentScan("com.jd.jhx.mvc")
public class MyMvcConfig extends WebMvcConfigurerAdapter{

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(converter());
    }

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/view/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    @Bean
    public DemoInterceptor demoInterceptor(){
        return new DemoInterceptor();
    }

    @Bean
    public MyMessageConverter converter(){
        return new MyMessageConverter();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInterceptor());
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/testview").setViewName("index");
        registry.addViewController("/converter").setViewName("converter");
    }
}
