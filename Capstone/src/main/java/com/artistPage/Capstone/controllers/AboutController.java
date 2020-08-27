package com.artistPage.Capstone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class AboutController {


    @RequestMapping("")
    public String index(Model model){
        return "index";
    }
}
