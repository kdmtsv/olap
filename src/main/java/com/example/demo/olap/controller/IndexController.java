package com.example.demo.olap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class IndexController {

    @GetMapping
    public String index(Map<String, Object> model) {
        model.put("title", "Olap Application");
        return "index";
    }
}
