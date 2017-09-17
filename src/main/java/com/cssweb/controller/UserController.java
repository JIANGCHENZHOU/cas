package com.cssweb.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jcz on 2017/9/9.
 */
@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("queryUser")
    public Map<String, String> queryUser(HttpServletRequest request){
        Map<String,String> map = new HashMap<>();
        map.put("name", "jcz");
        map.put("session", request.getSession().getId());
        return map;
    }
}
