package com.seccion3.seccion3web.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import com.seccion3.seccion3web.models.Product;
@RequestScope
@Primary
@Repository("productList")
public class ProductRepositoryImpl implements ProductRepository{

    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
            new Product(1L, "Product 1", 100L),
            new Product(2L, "Product 2", 200L),
            new Product(3L, "Product 3", 300L)
        );
    }

    //buscar todos los productos
    @Override
    public List<Product> findAll() {
        return data;
    }

    //buscar un producto por id
    @Override
    public Product findById(Long id) {
        //stream() es para que recorra la lista de productos
        //filter() es para que filtre los productos
        //findofirst() es para que retorne el primer producto que encuentre
        //orElse(null) es para que si no encuentra el producto, retorne null
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }   



}
