package com.soddy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * controller
 * Created by soddygosongguochao on 2017/4/27.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","soddy");

        return "welcome";
    }
}
