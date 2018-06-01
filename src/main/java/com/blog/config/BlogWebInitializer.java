package com.blog.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by 肖强 on 2018/5/31.
 * BlogWebInitializer
 * 在Servlet 3.0环境中
 * 容器会在类路径中查找实现javax.servlet.ServletContainerInitializer接口的类
 * 如果能发现的话， 就会用它来配置Servlet容器。
 */
public class BlogWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class<?>[]{BlogRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class<?>[]{BlogWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //将DispatcherServlet映射到"/"
        return new String[]{"/"};
    }
}
