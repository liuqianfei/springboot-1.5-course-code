package com.daimafans.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liuqianfei
 * @since 2018/9/13 18:40
 */
@Controller
public class IndexController
{
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }
}
