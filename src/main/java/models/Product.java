package models;

import models.variant.Variant;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Product {

    private Integer id;
    private String name;
    private double price;
    private String description;
    private int quantity;
    private Collection collection;
    private Set<Image> images = new HashSet<Image>(5);
    private static List<Product> products;
    private Variant variant;

    public Product(){}

    public Product(Integer id, String name, double price, String description, int quantity, Collection collection, Set<Image> images) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.collection = collection;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static void setProducts(List<Product> products) {
        Product.products = products;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", Collection=" + collection +
                ", images=" + images +
                '}';
    }

    //Insert

    //search

    //listAll
}