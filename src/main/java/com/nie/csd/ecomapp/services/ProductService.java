package com.nie.csd.ecomapp.services;

import com.nie.csd.ecomapp.models.Products;
import com.nie.csd.ecomapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Products> getAllProducts() {
        return repository.findAll();
    }

    public Optional<Products> getProductById(Integer id) {
        return repository.findById(id);
    }

    public Products addProduct(Products product) {
        return repository.save(product);
    }

    public Products updateProduct(Integer id, Products product) {
        Products existingProduct = repository.findById(id).orElse(null);

        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setCategory(product.getCategory());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setQuantity(product.getQuantity());
            existingProduct.setTags(product.getTags());

            return repository.save(existingProduct);
        }
        return null;
    }

    public void deleteProduct(Integer id) {
        repository.deleteById(id);
    }
}
