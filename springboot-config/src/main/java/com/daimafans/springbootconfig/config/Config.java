package com.daimafans.springbootconfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liuqianfei
 * @since 2018/9/11 15:04
 */
@Component
@ConfigurationProperties(prefix="config")
// @EnableConfigurationProperties(value= {Config.class})
public class Config
{
    private String number;
    private String name;
    private List<String> hobby;

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<String> getHobby()
    {
        return hobby;
    }

    public void setHobby(List<String> hobby)
    {
        this.hobby = hobby;
    }
}
