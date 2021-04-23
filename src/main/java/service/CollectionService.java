package service;

import model.Collection;
import repository.Repository;
import java.util.HashMap;

public class CollectionService implements Repository {

    private ProductService productService = new ProductService();

    //Save Collections
    public void saveCollection(Collection collection){
        collections.put(collection, new HashMap<>());
    }

    //Exist Collection
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

}
