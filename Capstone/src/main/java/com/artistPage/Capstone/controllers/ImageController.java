package com.artistPage.Capstone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("view")
public class ImageController {

    @RequestMapping("")
    public String displayImage(Model model) {
        return "view";
    }

}
