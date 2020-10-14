package com.artistPage.Capstone.controllers;

import com.artistPage.Capstone.Storage.StorageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ImageController {
    private StorageService storageService;
    public static List<MultipartFile> images = new ArrayList<MultipartFile>();

    @RequestMapping("view")
    public String displayImage(Model model){
        return "view";
    }

    @GetMapping("add")
    public String displayAddImageForm(Model model){
//        model.addAttribute(new MultipartFile());
        model.addAttribute("title", "Add Image");

        return "add";
    }

    @PostMapping("add")
    public String addImageToGallery(@RequestParam MultipartFile file, Model model, Errors errors){
        if(errors.hasErrors()){
            model.addAttribute("title", "Add Image");
            return "add";
        }
//        if(!file.isEmpty()){
//            StorageService.store(file);
//            images.add(file);
//        }
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
