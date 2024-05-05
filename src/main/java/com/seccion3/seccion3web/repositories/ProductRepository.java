package com.seccion3.seccion3web.repositories;

import java.util.List;

import com.seccion3.seccion3web.models.Product;

public interface ProductRepository {
    
    List<Product> findAll();

    Product findById(Long id);
}
