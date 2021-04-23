package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product {
    private String name;
    private double price;
    private String description;
    private int quantity;
    private ProductVariant productVariant;
    private Map<String, List<Images>> images = new HashMap<>(5);

    public Product() {
    }

    public Product(String name, double price, String description, int quantity, ProductVariant productVariant, Map<String, List<Images>> images) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.productVariant = productVariant;
        this.images = images;
    }


    public Product(String name, double price, String description, int quantity, Map<String, List<Images>> images) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductVariant getProductVariant() {
        return productVariant;
    }

    public void setProductVariant(ProductVariant productVariant) {
        this.productVariant = productVariant;
    }

    public Map<String, List<Images>> getImages() {
        return images;
    }

    public void setImages(Map<String, List<Images>> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Product {" +
                "\n name= '" + name + '\'' +
                "\n price= " + price +
                "\n description= '" + description + '\'' +
                "\n quantity= " + quantity +
                "\n productVariant= " + productVariant +
                "\n images= " + images +
                '}';
    }
}

