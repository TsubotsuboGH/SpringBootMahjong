package com.example.demo;


import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerDemo {

    @RequestMapping(value="/")
    private String hello() {
        return "index.html";
    }
    
    @RequestMapping(value="/mahjong")
    private String mahjong() {
        return "mahjong.html";
    }
    
    // POST は getter とか setter とか設定しないといけないらしい
    @GetMapping("/get_method")
    @ResponseBody
    public String getMethod(@RequestParam("get_param") String get_param) {
        System.out.println(get_param);
        return "GET -> " + get_param;
//        model.addAttribute("name", name);
//        return "next.html";
    }
}
