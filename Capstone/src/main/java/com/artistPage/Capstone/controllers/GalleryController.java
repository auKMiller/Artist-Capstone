package com.artistPage.Capstone.controllers;

import com.artistPage.Capstone.models.data.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("gallery")
public class GalleryController {

    @Autowired
    private GalleryRepository galleryRepository;

    @RequestMapping("")
    public String displayMainPage(Model model){
        return "gallery";
    }


}
