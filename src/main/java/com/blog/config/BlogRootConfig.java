package com.blog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by 肖强 on 2018/5/31.
 * BlogRootConfig
 */
@Configuration
@ComponentScan(basePackages = {"com"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,
                value = EnableWebMvc.class)})
public class BlogRootConfig {
}
