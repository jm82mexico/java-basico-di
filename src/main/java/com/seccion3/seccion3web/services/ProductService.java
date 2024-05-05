package com.seccion3.seccion3web.services;

import java.util.List;
import java.util.stream.Collectors;

import com.seccion3.seccion3web.models.Product;
import com.seccion3.seccion3web.repositories.ProductRepository;

public class ProductService {
    private ProductRepository productRepository = new ProductRepository();

    public List<Product> findAll() {
        return productRepository.findAll().stream().map(p  -> {
            Double priceImp = p.getPrice() * 1.21d;
            p.setPrice(priceImp.longValue());
            return p;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
       return productRepository.findById(id);
    }
}
