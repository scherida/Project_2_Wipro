
import model.*;
import model.Collection;
import org.junit.Assert;
import org.junit.Test;

import repository.Repository;
import service.CollectionService;
import service.ProductService;
import service.SubCollectionService;

import java.util.*;

public class CollectionAndSubCollectionTest {

    Repository repository;

    CollectionService collectionService = new CollectionService();
    SubCollectionService subCollection = new SubCollectionService();

    ProductService productService = new ProductService();

    String[] keywords = new String[6];
    Collection collection = new Collection("collection1","description", keywords);
    SubCollection subCollection1 = new SubCollection("subCollection1","description", keywords);
    SubCollection subCollection2 = new SubCollection("subCollection2","description", keywords);

    Map<String, List<Images>> images = new HashMap<>(5);
    ProductVariant productVariant = new ProductVariant();

    Product product1 = new Product("product 1",10,"test product 1",1,images);
    Product product2 = new Product("product 2",70,"test product 2",2, productVariant, images);

    @Test
    public void saveTest(){
        collectionService.save(collection);
        subCollection.save(collection,subCollection1);
        Assert.assertTrue(repository.collections.size()>0);
    }

    @Test
    public void insertProductIntoAnExistingSubCollectionTest(){
        collectionService.save(collection);
        subCollection.save(collection,subCollection1);

        Assert.assertTrue(subCollection.insertSubCollection(product2,subCollection1));
    }

    @Test
    public void searchSubCollectionTest(){
        productService.save(product1);
        collectionService.save(collection);
        subCollection.save(collection,subCollection2);
        subCollection.insertSubCollection(product1,subCollection2);
        boolean product = subCollection.searchSubCollection("subCollection2","name");

        Assert.assertNull(product);
    }

    @Test
    public void checkCollectionTest(){
        collectionService.save(collection);
        Collection collection1 = collectionService.checkCollection("name");
        Collection collection2 = collectionService.checkCollection("others...");

        Assert.assertEquals(collection,collection1);
        Assert.assertEquals(new Collection(),collection2);
    }
}
