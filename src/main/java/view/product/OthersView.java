package view.product;

import model.Images;
import model.Product;
import model.SubCollection;
import service.ProductService;
import view.collection.CollectionView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OthersView {
    static Scanner scan = new Scanner(System.in);
    static ProductService productService = new ProductService();

    public static void createProductMenu(){
        System.out.println("Create new product");
        System.out.println("====================");

        System.out.println("Product name: ");
        String name = scan.nextLine();

        double price = ProductView.validPrice();

        System.out.println("Description of the Product: ");
        String description = scan.nextLine();

        int quantity = ProductView.validQuantity();

        System.out.println("Product Images, max 5:");
        List<Images> imagesList = view.images.ImagesMenu.createImagesMenu();
        Map<String,List<Images>> images = new HashMap<>();
        images.put(name,imagesList);

        Product product = new Product(name, price, description,quantity, images);
        productService.save(product);
        System.out.println("What is the Sub Collection");
        String subCollectionName = scan.nextLine();
        SubCollection subCollection = CollectionView.createSubCollectionMenu(subCollectionName);
        if(CollectionView.insertProductIntoAnExistingSubCollection(product,subCollection)){
            System.out.println("Product Created");
            System.out.println(product);
        }else{
            System.err.println("Error to create the product");
        }
    }
}
