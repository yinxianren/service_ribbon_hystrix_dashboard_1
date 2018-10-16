package com.yinxianren.study.controller;

import com.yinxianren.study.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @RequestMapping("/hi")
    public String hi(String name) {
        return hiService.hi(name);
    }


}
