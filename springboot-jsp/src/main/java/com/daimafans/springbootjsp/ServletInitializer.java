package com.daimafans.springbootjsp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author liuqianfei
 * @since 2018/9/13 18:36
 */
public class ServletInitializer extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(SpringbootJspApplication.class);
    }

}
