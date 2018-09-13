package com.daimafans.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daimafans.springbootconfig.config.Config;

/**
 * SpringBoot 配置讲解
 *
 * @author liuqianfei
 * @since 2018/9/11 13:13
 */
@RestController
public class ConfigController
{
    @Value("${blog.address}")
    String address;

    @Value("${blog.author}")
    String author;

    @Value("${blog.desc}")
    String desc;

    @Value("${blog.info}")
    String info;

    @Value("${rnd.test2}")
    int test2;

    @Autowired
    Config config;

    @RequestMapping("/")
    public String blog()
    {
        // return address + "<br>" + author + "<br>" + desc;
        return info;
    }

    @RequestMapping(value = "random", method = RequestMethod.GET)
    public String random()
    {
        return String.valueOf(test2);
    }

    @GetMapping(value = "config")
    public Config config()
    {
        return config;
    }
}
