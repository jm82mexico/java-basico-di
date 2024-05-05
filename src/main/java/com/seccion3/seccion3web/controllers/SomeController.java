package com.seccion3.seccion3web.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion3.seccion3web.models.Product;
import com.seccion3.seccion3web.services.ProductService;

@RestController
@RequestMapping("/api")
public class SomeController {

    private ProductService productService = new ProductService();

    @GetMapping
    public List<Product> list(){
        return productService.findAll();
    }

    @GetMapping("{id}")
    public Product get(@PathVariable Long id){
        return productService.findById(id);
    }
}
