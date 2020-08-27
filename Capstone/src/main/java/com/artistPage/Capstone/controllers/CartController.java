package com.artistPage.Capstone.controllers;

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
}
