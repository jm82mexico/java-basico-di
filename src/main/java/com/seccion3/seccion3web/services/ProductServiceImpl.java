package com.seccion3.seccion3web.services;

import java.util.List;
import java.util.stream.Collectors;

import com.seccion3.seccion3web.models.Product;
import com.seccion3.seccion3web.repositories.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService{
    private ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll().stream().map(p  -> {
            Double priceImp = p.getPrice() * 1.21d;
            //Product newProduct = new Product(p.getId(), p.getProduct(),priceImp.longValue()); 
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(priceImp.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }
    @Override
    public Product findById(Long id) {
       return productRepository.findById(id);
    }
}