package com.artistPage.Capstone.controllers;

import com.artistPage.Capstone.models.data.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("cart")
public class CartController {

    @RequestMapping("")
    public String cart(Model model) {
        return "cart";
    }

    @Autowired
    private ImageRepository imageRepository;

    static HashMap<String, String> columnImages = new HashMap<>();

    public CartController() {

        columnImages.put("image", "Image");
    }

}