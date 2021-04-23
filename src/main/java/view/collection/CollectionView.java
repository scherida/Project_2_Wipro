package view.collection;

import model.Collection;
import model.Product;
import model.SubCollection;
import service.CollectionService;
import service.SubCollectionService;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static view.product.ProductView.productName;

public class CollectionView {
    static Scanner scan = new Scanner(System.in);
    static CollectionService collectionService = new CollectionService();

    static SubCollectionService subCollectionService = new SubCollectionService();


    public static SubCollection createSubCollectionMenu(String subCollectionName) {
        SubCollection subCollection = subCollectionService.checkExistSubCollection(subCollectionName);
        if(subCollection.getName() == null){
            do {
                System.out.println("SubCollection Name:");
                System.out.println(subCollectionName);
                System.out.println("SubCollection Description");
                String subCollectionDescription = scan.nextLine();
                String[] subCollectionKeywords = new String[6];
                int qnt;
                boolean checkQnt;
                do {
                    qnt = validQuantity();
                    checkQnt = subCollectionService.validQntKeywords(qnt);
                    if(!checkQnt){
                        System.err.println("Limit 6 keywords");
                    }
                } while (!checkQnt);
                for (int i = 0; i < qnt; i++) {
                    String keyword;
                    do {
                        System.out.println("Keyword " + (i + 1));
                        keyword = scan.nextLine();
                        if (keyword.isEmpty()) {
                            System.err.println("Required");
                        }
                    } while (keyword.isEmpty());
                    subCollectionKeywords = subCollectionService.getKeywords(i, keyword, subCollectionKeywords);
                }
                subCollection = new SubCollection(subCollectionName,subCollectionDescription,subCollectionKeywords);

                if(subCollection.equals(new SubCollection())){
                    System.err.println("Something wrong!");
                }else{
                    System.out.println("Which collection does this sub collection belong?");
                    String collectionName = scan.nextLine();
                    Collection collection = collectionService.checkExistCollection(collectionName);
                    if(collection.getName() == null){
                        collection = createCollectionMenu(collectionName);
                    }
                    if(subCollection.getName()!=null || subCollection.getDescription()!=null||subCollection.getKeywords()!=null){
                        subCollectionService.saveSubCollection(collection,subCollection);
                        System.out.println("SubCollection Created");
                    }else {
                        System.err.println("All fields are required");
                    }
                }
            }while (subCollection.getDescription().isEmpty());
        }else{
            CollectionView.subCollectionAlreadyExist();
        }
        return subCollection;
    }

    public static Collection createCollectionMenu(String collectionName){
        Collection collection = collectionService.checkExistCollection(collectionName);
        if(collection.getName()==null) {
            do {
                System.out.println("Product Collection: ");
                System.out.println(collectionName);
                collection.setName(collectionName);

                System.out.println("Description of the Collection: ");
                collection.setDescription(scan.nextLine());

                String[] collectionKeywords = new String[6];
                int qnt;
                boolean checkQnt;
                do {
                    qnt = validQuantity();
                    checkQnt = subCollectionService.validQntKeywords(qnt);
                    if (!checkQnt) {
                        System.err.println("Limit 6 keywords");
                    }
                } while (!checkQnt);
                for (int i = 0; i < qnt; i++) {
                    String keyword;
                    do {
                        System.out.println("Keyword " + (i + 1));
                        keyword = scan.nextLine();
                        if (keyword.isEmpty()) {
                            System.err.println("Required");
                        }
                    } while (keyword.isEmpty());

                    collectionKeywords = subCollectionService.getKeywords(i, keyword, collectionKeywords);
                }
                collection.setKeywords(collectionKeywords);
                if (collection.getName().isEmpty() || collection.getDescription().isEmpty()) {
                    System.err.println("All fields are required");
                } else {
                    collectionService.saveCollection(collection);
                    System.out.println("Collection Created");
                }
            } while (collection.getDescription().isEmpty());
        }else{
            CollectionView.collectionAlreadyExist();
        }

        return collection;
    }

    public static String subCollectionName(){
        String subCollectionName;
        do {
            System.out.println("Sub Collection Name?");
            subCollectionName = scan.nextLine();
            if (subCollectionName.isEmpty()) {
                System.err.println("Required");
            }
        }while (subCollectionName.isEmpty());
        return subCollectionName;
    }

    public static String collectionName(){
        String collectionName;
        do {
            System.out.println("Collection Name?");
            collectionName = scan.nextLine();
            if (collectionName.isEmpty()) {
                System.err.println("Required");
            }
        }while (collectionName.isEmpty());
        return collectionName;
    }

    public static void searchInSubCollection(){
        String subCollectionName = subCollectionName();
        String productName = productName();
        if (subCollectionService.searchForAProductInASubCollection(subCollectionName,productName)){
            System.out.println(productName+" is in the "+subCollectionName);
        }else{
            System.err.println("Not Founded!");
        }
    }

    public static void listProductInASubCollection(){
        List<Product> products = subCollectionService.listAllProductInASubCollection(subCollectionName());
        if (!products.isEmpty()){
            System.out.println(products);
        }else {
            System.err.println("Not Founded!");
        }
    }

    public static void listCollectionsAndSubCollections() {
        if (!subCollectionService.checkCollectionsIsEmpty()) {
            System.out.println("All collections listed");
            System.out.println("======================");
            System.out.println();
            subCollectionService.listCollectionsAndSubCollections();
        }else {
            System.err.println("Nothing Registered, Create a new collection.");
        }
    }

    public static boolean insertProductIntoAnExistingSubCollection(Product product, SubCollection subCollection) {
        return subCollectionService.insertProductIntoAnExistingSubCollection(product,subCollection);
    }

    public static void subCollectionAlreadyExist() {
        System.err.println("SubCollection already exist.");
    }

    public static void collectionAlreadyExist() {
        System.err.println("Collection already exist.");
    }

    public static int validQuantity() {
        int quantity = -1;
        do{
            System.out.println("How many keywords?");
            try{
                quantity = Integer.parseInt(scan.nextLine());
            }catch (InputMismatchException | NumberFormatException err){
                System.err.println("Invalid Number, try again");
            }
        }while(quantity<0);
        return quantity;
    }
}
