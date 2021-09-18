package com.jeppu.controller;

import com.jeppu.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = {"/product"})
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(@Qualifier("productService1") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/all")
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "all-products";
    }

    //http://localhost:8080/spring_mvc_war_exploded/product/listProducts?categoryId=1&categoryName=Laptop
    //---When Categoryname is ommitted in the URL
    //http://localhost:8080/spring_mvc_war_exploded/product/listProducts?categoryId=1
    @RequestMapping(value = "/listProducts")
    public String getProductByCategory(@RequestParam String categoryId, @RequestParam(value = "categoryName", required = false, defaultValue = "IPhone") String name, Model model) {
        System.out.println("Category ID : " + categoryId);
        System.out.println("Category Name : " + name);
        model.addAttribute("categoryId", categoryId);
        model.addAttribute("categoryName", name);
        return "list-products";
    }
}
