package service;

import model.Product;
import repository.Repository;
import view.product.ProductView;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements Repository{

    public boolean listProducts() {
        boolean result = false;
        if (products.size() > 0) {
            products.forEach(System.out::println);
            result = true;
        }
        return result;
    }

    public boolean productsIsEmpty(){
        boolean result = false;
        if(products.size() > 0){
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
            ProductView.productsIsEmpty();
        }
        return productsByName;
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

    public void save(Product product) {
        products.add(product);
    }
}
