package services;

import models.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductService {
    private Map<String,Product> listProducts;

    public ProductService(Map<String, Product> listProducts) {
        this.listProducts = listProducts;
    }
    public ProductService() {
        this.listProducts = new HashMap<String, Product>();
    }

    public void saveProduct(Product product) {
        this.listProducts.put(product.getName(),product);
    }

    public void mapAllProducts() {
        if (!listProducts.isEmpty()){
            for(Map.Entry products:this.listProducts.entrySet()){
                System.out.println(products.getValue());
            }
        }else{
            System.out.println("Create a product first.");
        }
    }

    public boolean searchByName(String name) {
        boolean result =false;
        if (!listProducts.isEmpty()){
            for(Map.Entry products:this.listProducts.entrySet()) {
                if (products.getKey().equals(name)) {
                    System.out.println("Product founded");
                    System.out.println("Name: " + name);
                    System.out.println("Price: " + this.listProducts.get(name).getPrice());
                    System.out.println("Description: " + this.listProducts.get(name).getDescription());
                    result = true;
                }
            }
        }
        return result;
    }

}
