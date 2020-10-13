package com.artistPage.Capstone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

    @RequestMapping("index")
    public String index(Model model){
        return "index";
    }

    @RequestMapping("form")
    public String form(Model model){
        return "form";
    }
}
