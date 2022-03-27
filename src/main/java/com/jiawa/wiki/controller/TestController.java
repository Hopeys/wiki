package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("111");
        return "hello world000";
    }

    @RequestMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }

}
