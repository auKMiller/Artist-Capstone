package com.artistPage.Capstone.controllers;

import com.artistPage.Capstone.models.Image;
import com.artistPage.Capstone.models.data.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("gallery")
public class GalleryController {

    @Autowired
    private ImageRepository imageRepository;

    @RequestMapping("")
    public String displayMainPage(Model model){
        return "gallery";
    }

    @GetMapping
    public String displayAddImageForm(Model model){
        model.addAttribute("title", "Add Image");
        model.addAttribute(new Image());
        return "gallery/add";
    }


}
