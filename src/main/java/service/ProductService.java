package service;

import model.Product;
import repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements Repository{

    static ProductService productService = new ProductService();

    public void save(Product product) {
        products.add(product);
    }

    public boolean listProducts() {
        boolean result = false;
        if (products.size() > 0) {
            products.forEach(System.out::println);
            result = true;
        }
        return result;
    }

    public List<Product> searchByName(String name) {
        List<Product> productsByName = new ArrayList<>();
        if (productsIsEmpty()) {
            for (Product product : products) {
                if (product.getName().equalsIgnoreCase(name) || product.getName().startsWith(name)) {
                    productsByName.add(product);
                }
            }
        } else {
            if(!productService.productsIsEmpty()){
                System.err.println("Nothing Registered, Create a new product.");
            }
        }
        return productsByName;
    }

    public boolean productsIsEmpty(){
        boolean result = false;
        if(products.size() > 0){
            result = true;
        }
        return result;
    }

    public Product checkExistProduct(String productName){
        Product product = null;
        if (!products.isEmpty()) {
            for (Product product1 : products) {
                if (product1.getName().equalsIgnoreCase(productName)) {
                    product = product1;
                }
            }
        } else {
            System.err.println("Nothing Registered, Create a new Product.");
        }
        return product;
    }
}
