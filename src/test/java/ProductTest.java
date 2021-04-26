import model.*;
import org.junit.*;
import repository.Repository;
import service.ProductService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductTest {
    Repository repository;

    ProductService productService = new ProductService();

    Map<String, List<Images>> images = new HashMap<>(5);
    ProductVariant productVariant = new ProductVariant();

    Product product1 = new Product("product 1",10,"test product 1",1,images);
    Product product2 = new Product("product 2",70,"test product 2",2, productVariant, images);

    @Test
    public void listTest(){
        repository.products.add(product1);
        repository.products.add(product2);
        Assert.assertTrue(productService.listProducts());
    }

    @Test
    public void productsTest(){
        repository.products.add(product1);
        repository.products.add(product2);
        Assert.assertTrue(productService.productsIsEmpty());
    }

    @Test
    public void productsIsEmptyTest(){
        Assert.assertFalse(productService.productsIsEmpty());
    }

    @Test
    public void searchProducts(){
        repository.products.add(product1);
        repository.products.add(product2);

        List<Product> productsByName = productService.searchByName("name1");

        Assert.assertNotNull(productsByName);
    }
}
