package com.nie.csd.ecomapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "products")
public class Products {

    @Id
    private Integer id;  // keep it String, Mongo will cast 101 -> "101"

    private String name;
    private String description;
    private String category;
    private float price;

    private List<String> tags;  // tags should be an array
    private int stock;          // fix typo: stock not stacks

    public Products() {}

    public Products(Integer id, String name, String description, String category, float price, List<String> tags, int stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.tags = tags;
        this.stock = stock;
    }

    // getters and setters...
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }

    public List<String> getTags() { return tags; }
    public void setTags(List<String> tags) { this.tags = tags; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "Products{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", tags=" + tags +
                ", stock=" + stock +
                '}';
    }

    public Object getQuantity() {
        return stock;
    }

    public void setQuantity(Object quantity) {
        this.stock = (int) quantity;
    }
}
