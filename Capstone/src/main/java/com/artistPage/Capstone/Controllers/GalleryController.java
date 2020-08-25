package com.artistPage.Capstone.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("gallery")
public class GalleryController {

    @RequestMapping("")
    public String displayMainPage(Model model){
        return "gallery";
    }

}
