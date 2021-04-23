package view.product;

import enums.Activity;
import enums.Color;
import enums.Gender;
import enums.SizeSneakers;
import model.Images;
import model.Product;
import model.SubCollection;
import model.VariantSneakers;
import service.ProductService;
import view.collection.CollectionView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SneakersView {
    static Scanner scan = new Scanner(System.in);
    static ProductService productService = new ProductService();

    public static void createSneakersMenu(){
        System.out.println("Create new product");
        System.out.println("====================");

        System.out.println("Product name: ");
        String name = scan.nextLine();

        double price = ProductView.validPrice(); //ok

        System.out.println("Description of the Product: ");
        String description = scan.nextLine();

        int quantity = ProductView.validQuantity();//ok

        System.out.println("Product Images, max 5");
        List<Images> imagesList = view.images.ImagesMenu.createImagesMenu(); //ok
        Map<String,List<Images>> images = new HashMap<>();
        images.put(name,imagesList);

        VariantSneakers variantSneakers = new VariantSneakers();
        boolean allComplete;
        do{
            allComplete = view.product.SneakersView.variantSneakerMenu(variantSneakers); //ok

        }while (!allComplete);

        Product product = new Product(name, price, description,quantity,variantSneakers, images);
        productService.save(product); //ok

        System.out.println("What is the Sub Collection");
        String subCollectionName = scan.nextLine();
        SubCollection subCollection = CollectionView.createSubCollectionMenu(subCollectionName); //ok
        if(CollectionView.insertProductIntoAnExistingSubCollection(product,subCollection)){ //ok
            System.out.println("Product Created");
            System.out.println(product);
        }else{
            System.err.println("Error to create the product");
        }
    }

    public static boolean variantSneakerMenu(VariantSneakers variantSneakers){
        boolean allComplete = false;
        try {
            System.out.println("Product Variants: ");
            System.out.println("Colors (Blue, Red, Green, Gray, Black, White)");
            System.out.println("Color: ");
            variantSneakers.setColor(Color.valueOf(scan.nextLine().toUpperCase()));

            System.out.println("Gender (Female, Male, Others)");
            System.out.println("Gender: ");
            variantSneakers.setGender(Gender.valueOf(scan.nextLine().toUpperCase()));

            System.out.println("Size (34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46)");
            System.out.println("Size: ");
            variantSneakers.setSizeSneakers(SizeSneakers.valueOf("_"+scan.nextLine().toUpperCase()));

            System.out.println("Activity (Sport, Hiking, Casual, Social, Running)");
            System.out.println("Activity: ");
            variantSneakers.setActivity(Activity.valueOf(scan.nextLine().toUpperCase()));

            if(variantSneakers.getActivity()!= null){
                allComplete = true;
            }
        }catch (Exception err){
            System.err.println("Variant Unavailable");
        }
        return allComplete;
    }
}
