package com.nie.csd.ecomapp.repositories;

import com.nie.csd.ecomapp.models.Products;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends MongoRepository<Products, Integer> {

        }
