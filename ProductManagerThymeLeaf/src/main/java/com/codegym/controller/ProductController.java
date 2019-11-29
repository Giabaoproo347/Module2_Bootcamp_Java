package com.codegym.controller;

import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping ("/home")
    public String index(Model model) {
        model.addAttribute("product", productService.findAll());
        return "home";
    }

    @GetMapping ("/product/create")
    public String create (int id , Model model) {
        model.addAttribute("product",productService.findByID(id));
        return "create";

    }
}
