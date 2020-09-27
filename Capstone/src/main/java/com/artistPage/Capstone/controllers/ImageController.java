package com.artistPage.Capstone.controllers;

import com.artistPage.Capstone.models.Image;
import com.artistPage.Capstone.models.data.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("view")
public class ImageController {

    public static List<Image> images = new ArrayList<Image>();

    public List<Image> getImages(){
        return images;
    }


    @Autowired
    private ImageRepository imageRepository;

    @RequestMapping("")
    public String displayImage(Model model) {
        return "view";
    }


    public static void setImages(List<Image> images) {
        ImageController.images = images;
    }
}
