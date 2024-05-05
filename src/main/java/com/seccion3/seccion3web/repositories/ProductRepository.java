package com.seccion3.seccion3web.repositories;

import java.util.Arrays;
import java.util.List;

import com.seccion3.seccion3web.models.Product;

public class ProductRepository {

    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
            new Product(1L, "Product 1", 100L),
            new Product(2L, "Product 2", 200L),
            new Product(3L, "Product 3", 300L)
        );
    }
    //buscar todos los productos
    public List<Product> findAll() {
        return data;
    }

    //buscar un producto por id
    public Product findById(Long id) {
        //stream() es para que recorra la lista de productos
        //filter() es para que filtre los productos
        //findofirst() es para que retorne el primer producto que encuentre
        //orElse(null) es para que si no encuentra el producto, retorne null
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }   



}
