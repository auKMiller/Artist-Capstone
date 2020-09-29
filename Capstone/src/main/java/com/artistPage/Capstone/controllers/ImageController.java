package com.artistPage.Capstone.controllers;

import com.artistPage.Capstone.models.Image;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("view")
public class ImageController {

    public static List<Image> images = new ArrayList<Image>();

    @RequestMapping("")
    public String displayImage(Model model){
        return "view";
    }

    @GetMapping("add")
    public String displayAddImageForm(Model model){
        model.addAttribute("title", "Add Image");

        return "add";
    }


//    @Autowired
//    private ImageRepository imageRepository;
//
//    @RequestMapping("view/{imageId}")
//    public String displayImageById(@ModelAttribute Image newImage, Model model, @PathVariable int imageId) {
//        model.addAttribute("title", "Add Image");
//        imageRepository.save(newImage);
//        return "redirect:";
//    }
//
//    @PostMapping("gallery/{imageId}")
//    public String uploadImagesToGallery(Model model, @PathVariable int imageId){
//        imageRepository.findById(imageId);
//        model.addAttribute("image", images);
//        return "gallery";
//    }
}
