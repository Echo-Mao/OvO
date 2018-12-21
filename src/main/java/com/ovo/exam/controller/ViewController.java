package com.ovo.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    
    @RequestMapping("/login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/index")
    public String toIndex() {
        return "index";
    }
    
    @RequestMapping("/add")
    public String toAdd() {
        return "add";
    }
    
    @RequestMapping("/update")
    public String toUpdate() {
        return "update";
    }

}
