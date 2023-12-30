package com.tortoise.kob.pk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pk/")
public class IndexController {

    @RequestMapping("index/")
    public String index() {
        System.out.println("This is bug");
        return "pk/index.html";
    }
}
