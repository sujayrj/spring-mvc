package com.jeppu.services;

import com.jeppu.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service(value = "productService1")
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> getAllProducts() {
        return Arrays.asList(
                new Product("Laptop", 66553.50),
                new Product("Iphone", 56000),
                new Product("Router", 4500)
        );
    }
}
