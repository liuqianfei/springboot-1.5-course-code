package com.daimafans.springboothelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuqianfei
 * @since 2018/9/6 20:19
 */
@RestController
public class HelloWorldController
{
    @GetMapping(value = "index")
    public String index()
    {
        return "Hello Spring Boot World!<br> .via 代码饭";
    }
}
