package com.nie.csd.ecomapp.controllers;

import com.nie.csd.ecomapp.models.Products;
import com.nie.csd.ecomapp.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String products() {
        return "Product list";
    }

    @GetMapping("/getAllProducts")
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Optional<Products> getProductById(@PathVariable("id") Integer id){
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public Products addProduct(@RequestBody Products product){
        return productService.addProduct(product);
    }

    @PutMapping("/products/{id}")
    public Products updateProduct(@PathVariable("id") Integer id, @RequestBody Products product){
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id) {
        if (productService.getProductById(id).isPresent()) {
            productService.deleteProduct(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
