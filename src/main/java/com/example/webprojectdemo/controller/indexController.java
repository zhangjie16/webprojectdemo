package com.example.webprojectdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@RestController
@Controller
@Slf4j
public class indexController {

    @RequestMapping("/index")
    public Object index(@RequestParam("name") String name , String userId, Model model){
        Map<String, Object> map2 = model.asMap();
        System.out.println(map2);
        log.info("name = {}; userId = {}",name ,userId);
        HashMap map = new HashMap();
        map.put("name","zhangjie");
        map.put("usrId","234");
        return map;
    }

    @RequestMapping("/hello")
    public String hello(Model model) {
        Map<String, Object> map = model.asMap();
        System.out.println(map);
        int i = 1 / 0;
        return "hello controller advice";
    }

}
