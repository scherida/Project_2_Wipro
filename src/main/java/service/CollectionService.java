package service;

import model.Collection;
import model.Product;
import model.SubCollection;
import repository.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionService implements Repository {

    private ProductService productService = new ProductService();

    //Save Collections
    public void saveCollection(Collection collection){
        collections.put(collection, new HashMap<>());
    }

    //Save SubCollections
    public void saveSubCollection(Collection collection, SubCollection subCollection){
        collections.get(collection).put(subCollection,new ArrayList<>());
    }

    public boolean insertProductIntoAnExistingSubCollection(Product product, SubCollection subCollection){
        boolean result = false;
        Collection collection = getCollectionBySubCollection(subCollection);
        if (subCollection.getName()!= null && product.getName()!=null && collection.getName()!=null){
            collections.get(collection).get(subCollection).add(product);
            result = true;
        }
        return result;
    }

    public void listCollectionsAndSubCollections() {
          collections.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public boolean searchForAProductInASubCollection(String subCollectionName, String productName) {
        boolean result = false;
        SubCollection subCollection = checkExistSubCollection(subCollectionName);
        Collection collection = getCollectionBySubCollection(subCollection);
        Product product = productService.checkExistProduct(productName);
        if (subCollection.getName()!=null && product.getName()!=null && collection.getName()!=null){
            if(collections.get(collection).get(subCollection).contains(product)){
                result = true;
            }
        }
        return result;
    }

    public List<Product> listAllProductInASubCollection(String subCollectionName) {
        List<Product> products= new ArrayList<>();
        SubCollection subCollection = checkExistSubCollection(subCollectionName);
        if (subCollection.getName()!=null){
            for (Collection collection: collections.keySet()){
                products=collections.get(collection).get(subCollection);
            }
        }
        return products;
    }

    public Collection checkExistCollection(String collectionName) {
        Collection collection = new Collection();
        if (!collections.isEmpty()) {
            for (Collection key: collections.keySet()){
                if(key.getName().equalsIgnoreCase(collectionName)){
                    collection = key;
                    break;
                }
            }
        }
        return collection;
    }

    public SubCollection checkExistSubCollection(String subCollectionName){
        SubCollection subCollection = new SubCollection();
        for (Collection collectionKey: collections.keySet()){
            if (!collections.get(collectionKey).isEmpty()) {
                for (SubCollection subCollectionKey: collections.get(collectionKey).keySet()){
                    if(subCollectionKey.getName().equalsIgnoreCase(subCollectionName)){
                        subCollection = subCollectionKey;
                        break;
                    }
                }
            }
        }
        return subCollection;
    }

    public Collection getCollectionBySubCollection(SubCollection subCollection){
        Collection collection = new Collection();
        for (Collection collectionKey: collections.keySet()){
            if (collections.get(collectionKey).containsKey(subCollection)) {
                collection = collectionKey;
            }
        }
        return collection;
    }

    public boolean checkCollectionsIsEmpty(){
        boolean result = false;
        if(collections.isEmpty()){
            result = true;
        }
        return result;
    }

    public boolean validQntKeywords(int qnt) {
        boolean result = false;
        if (qnt < 7) {
            result = true;
        }
        return result;
    }

    public String[] getKeywords(int i, String keyword, String[]keywords) {
        int position = 0;
        if (keywords[i] != null) {
            position += 1;
        }
        keywords[position] = keyword;
        return keywords;
    }

}
