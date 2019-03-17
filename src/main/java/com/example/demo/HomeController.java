package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
    @RequestMapping("/")
    public  String homepage(Model model){
        model.addAttribute("myvar1", "Say Hello");
        model.addAttribute("myvar2", "to the people");
                return "hometemplate";

    }
}
