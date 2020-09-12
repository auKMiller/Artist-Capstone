package com.artistPage.Capstone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class ImageController {

    public String displayImage() {
        return "view";
    }

}
