package com.nie.csd.ecomapp.controllers;

import com.nie.csd.ecomapp.exception.IdNotPresentException;
import com.nie.csd.ecomapp.models.Products;
import com.nie.csd.ecomapp.services.ProductService;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<List<Products>> getAllProducts() {
        List<Products> productList = productService.getAllProducts();
        return ResponseEntity.status(HttpStatus.OK).body(productList);
    }


    @GetMapping("/products/{id}")
    public ResponseEntity<Optional<Products>> getByProductId(@PathVariable("id") Integer id) throws IdNotPresentException {
        Optional<Products> product = productService.getProductById(id);
        return ResponseEntity.status(HttpStatus.OK).body(product);
        //.orElseThrow(() -> new RuntimeException("Product not found with id " + id));
    }


    @PostMapping("/products")
    public Products addProduct(@RequestBody Products product){
        Products newProduct = productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct).getBody();

    }

    @PutMapping("/products/{id}")
    public Products updateProduct(@PathVariable("id") Integer id, @RequestBody Products product){
        Products updatedProduct = productService.updateProduct(id, product); // Placeholder return statement
        return ResponseEntity.status(HttpStatus.OK).body(updatedProduct).getBody();

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
