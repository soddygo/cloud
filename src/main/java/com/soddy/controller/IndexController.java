package com.soddy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * controller
 * Created by soddygosongguochao on 2017/4/27.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "soddy");

        return "welcome";
    }

    @RequestMapping("/test")
    public String testDemo(Model model) {
        model.addAttribute("name", "soddy");

        return "redirect:testDemo.html";
    }


    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "hello world";
    }
}
