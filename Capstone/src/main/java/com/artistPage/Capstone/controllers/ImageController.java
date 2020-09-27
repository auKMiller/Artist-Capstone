package com.artistPage.Capstone.controllers;

import com.artistPage.Capstone.models.Image;
import com.artistPage.Capstone.models.data.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("view")
public class ImageController {

    public static List<Image> images = new ArrayList<Image>();

    public List<Image> getImages(){
        return images;
    }


    @Autowired
    private ImageRepository imageRepository;

    @RequestMapping("view/{imageId}")
    public String displayImageById(Model model, @PathVariable int imageId) {

        Optional optImage = imageRepository.findById(imageId);
        if(optImage.isPresent()){
            Image image = (Image) optImage.get();
            model.addAttribute("image", image);
        }
        return "view";
    }


    public static void setImages(List<Image> images) {
        ImageController.images = images;
    }
}
