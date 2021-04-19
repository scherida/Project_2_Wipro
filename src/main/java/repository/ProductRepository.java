package repository;

import models.Product;

public interface ProductRepository {
    void saveProduct(Product product);
    void mapAllProducts();
    boolean searchByName(String name);
}