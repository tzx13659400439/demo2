package com.example.demo2.web.controller;


import com.example.demo2.bean.Message;
import entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    //传map
    @GetMapping("/test")
    public Map<String,String> test1(){
        Map<String,String> map = new HashMap<>();
        map.put("name","雷诗琴");
        map.put("appearance","beauty");
        return map;
    }

    //传list
    @GetMapping("/List")
    public List<Map<String,String>> test2(){
        Map<String,String> map = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        map.put("name","tzx");
        map2.put("name","hzx");
        List<Map<String,String>>  list = new ArrayList<>();
        list.add(map);
        list.add(map2);
        return list;
    }

    //传bean
    @GetMapping("/beanTest2")
    public Person Bean(){
        Person per = new Person(true,23,"tzx");
        return per;
    }

    //get传String
    @GetMapping("/hello1")
    public String hello(){
        return "喜欢诗琴";
    }

    //post传String
    @PostMapping("/kl")
    public String KL(){
        return "你不配";
    }


    //接收浏览器单个参数数据
    @GetMapping("/test4")
    public String test4(String name,int age){
        System.out.println("name="+name);
        System.out.println("age="+age);
        return "哈哈";
    }

    //接收浏览器bean
    @GetMapping("/test5")
    public String test5(Person per){
        System.out.println(per.toString());
        return "收到了";
    }

    //接收
    @GetMapping("/add")
    public String add(){
        return "学生添加成功！";
    }
}
