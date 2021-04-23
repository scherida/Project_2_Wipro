package repository;

import model.Collection;
import model.Product;
import model.SubCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Repository {
    List<Product> products = new ArrayList<>();
    Map<Collection, Map<SubCollection, List<Product>>> collections = new HashMap<>();
}
