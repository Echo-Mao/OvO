package com.ovo.exam.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ovo.exam.entity.Employee;
import com.ovo.exam.service.IServiceOfEmployee;

@Controller
public class EmployeeController {
    
    @Autowired
    private IServiceOfEmployee soe;
    
    @RequestMapping("/login.action")
    @ResponseBody
    public Map<String, Object> login(Employee loginInfo, HttpSession session){
        Map<String, Object> json = new HashMap<>();
        System.out.println(loginInfo);
        loginInfo = soe.login(loginInfo);
        if (loginInfo != null) {
            session.setAttribute("loginInfo", loginInfo);
            json.put("message", true);
        } else {
            json.put("message", false);
        }
        return json;
    }

}
