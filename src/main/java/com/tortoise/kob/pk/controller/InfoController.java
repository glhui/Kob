package com.tortoise.kob.pk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class InfoController {

    @RequestMapping("info/")
    public Map<String, String> getBotInfo() {

        Map<String, String> bot_info = new HashMap<>();
        bot_info.put("name", "tiger");
        bot_info.put("rating", "1500");

        return bot_info;
    }

    @RequestMapping("getbotinfo/")
    public List<String> getBotNameInfo() {
        List<String> list = new LinkedList<>();
        list.add("hhh");
        list.add("wrewer");
        return list;
    }
}
