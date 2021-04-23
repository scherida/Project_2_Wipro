package view.product;

import enums.Color;
import enums.Gender;
import enums.SizeTshirt;
import enums.Sleeve;
import model.Images;
import model.Product;
import model.SubCollection;
import model.VariantTShirt;
import service.ProductService;
import view.collection.CollectionView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TShirtView {
    static Scanner scan = new Scanner(System.in);
    static ProductService productService = new ProductService();

    public static void createTShirtMenu(){
        System.out.println("Create new product");
        System.out.println("====================");

        System.out.println("Product name: ");
        String name = scan.nextLine();

        double price = ProductView.validPrice();

        System.out.println("Description of the Product: ");
        String description = scan.nextLine();

        int quantity = ProductView.validQuantity();

        System.out.println("Product Images, max 5");
        List<Images> imagesList = view.images.ImagesMenu.createImagesMenu();
        Map<String,List<Images>> images = new HashMap<>();
        images.put(name,imagesList);

        VariantTShirt variantTshirt = new VariantTShirt();
        boolean allComplete;
        do{
            allComplete = view.product.TShirtView.variantTShirtMenu(variantTshirt);

        }while (!allComplete);

        Product product = new Product(name, price, description,quantity,variantTshirt, images);

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

    public static boolean variantTShirtMenu(VariantTShirt variantTshirt){
        boolean allComplete = false;
        try {
            System.out.println("Product Variants: ");
            System.out.println("Colors (Yellow, Purple, Salmon, Blue, Red, Green, Gray, Black, White)");
            System.out.println("Color: ");
            variantTshirt.setColor(Color.valueOf(scan.nextLine().toUpperCase()));

            System.out.println("Gender (Female, Male, Kids, Others)");
            System.out.println("Gender: ");
            variantTshirt.setGender(Gender.valueOf(scan.nextLine().toUpperCase()));

            System.out.println("Size (XS, S, M, L, XL, XXL)");
            System.out.println("Size: ");
            variantTshirt.setSizeTshirt(SizeTshirt.valueOf(scan.nextLine().toUpperCase()));

            System.out.println("Sleeve (Short, Medium, Long)");
            System.out.println("Sleeve: ");
            variantTshirt.setSleeve(Sleeve.valueOf(scan.nextLine().toUpperCase()));

            if(variantTshirt.getSleeve() != null){
                allComplete = true;
            }

        }catch (Exception err){
            System.err.println("Variant Unavailable");
        }
        return allComplete;
    }
}
