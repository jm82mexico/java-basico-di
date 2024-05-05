package com.seccion3.seccion3web.services;

import java.util.List;

import com.seccion3.seccion3web.models.Product;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);
}
