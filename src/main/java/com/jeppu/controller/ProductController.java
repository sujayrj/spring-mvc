package com.jeppu.controller;

import com.jeppu.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value={"/product"})
public class ProductController {

    private ProductService productService;

    @Autowired
    @Qualifier("productService1")
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/all")
    public String getAllProducts(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "all-products";
    }
}
