package com.nie.csd.ecomapp.models;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Products {
    @Id
    private String id;
    private String name;
    private String description;
    private String category;
    private float price;
    private String tags;
    private int stacks;
}
