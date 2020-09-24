package com.artistPage.Capstone.controllers;

import com.artistPage.Capstone.models.data.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cart")
public class CartController {

    @RequestMapping("")
    public String shoppingCart(Model model){
        return "cart";
    }

    @Autowired
    private ImageRepository imageRepository;

}
