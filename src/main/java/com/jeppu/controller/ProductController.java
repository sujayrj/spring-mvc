package com.jeppu.controller;

import com.jeppu.model.Product;
import com.jeppu.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = {"/product"})
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(@Qualifier("productService1") ProductService productService) {
        this.productService = productService;
    }

    @ModelAttribute("prods")
    public List<Product> allProducts() {
        return Arrays.asList(
                new Product("Dell Mouse", 150),
                new Product("Realme Phone", 5000),
                new Product("Realme airpods", 1500),
                new Product("Soundcore airpods", 800)
        );
    }

    @RequestMapping(value="/allProds")
    public String getAllProds(){
        return "all-prods";
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

    //http://localhost:8080/spring_mvc_war_exploded/product/owners/100/ownerName/Police
    @RequestMapping(value = "/owners/{ownerId}/ownerName/{ownerName}")
    public String findOwner(@PathVariable("ownerId") String id, @PathVariable String ownerName, Model model) {
        System.out.println("Owner id : " + id);
        System.out.println("Owner name : " + ownerName);
        model.addAttribute("ownerId", id);
        model.addAttribute("ownerName", ownerName);
        return "get-products";
    }

    @RequestMapping(value = "/getProductForm")
    public String getProductForm(@ModelAttribute("prod") Product product) {
        product.setName("AAA");
        product.setPrice(4444);
        return "all-products";
    }
}
