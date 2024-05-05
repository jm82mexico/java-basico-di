package com.seccion3.seccion3web.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.seccion3.seccion3web.models.Product;
//Se cambia la importación de ProductRepositoryImpl por ProductRepository
//para que se pueda inyectar la interfaz y no la clase
//y desacoplar la clase de la implementación
import com.seccion3.seccion3web.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    
    private ProductRepository productRepository ;    

    //la inyección de dependencias se hace por constructor
    //no se necesita el @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

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
