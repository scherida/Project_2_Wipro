package view.product;

import enums.*;
import model.Images;
import model.Product;
import model.SubCollection;
import model.VariantPants;
import service.ProductService;
import view.collection.CollectionView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PantsView {
    static Scanner scan = new Scanner(System.in);
    static ProductService productService = new ProductService();

    public static void createPants(){
        System.out.println("#### Create new product Pants: ####");
        System.out.println("=============================");

        System.out.println("Product name: ");
        String name = scan.nextLine();

        double price = ProductView.validPrice();

        System.out.println("Description: ");
        String description = scan.nextLine();

        int quantity = ProductView.validQuantity();

        System.out.println("Product Images, max 5:");
        List<Images> imagesList = view.images.ImagesMenu.createImagesMenu();
        Map<String,List<Images>> images = new HashMap<>();
        images.put(name,imagesList);

        boolean allComplete;
        VariantPants variantPants = new VariantPants();
        do{
            allComplete = view.product.PantsView.variantPants(variantPants);

        }while (!allComplete);

        Product product = new Product(name, price, description,quantity,variantPants, images);
        productService.save(product);

        System.out.println("What is the Sub Collection?");
        String subCollectionName = scan.nextLine();
        SubCollection subCollection = CollectionView.createSubCollectionMenu(subCollectionName);
        if(CollectionView.insertProductIntoAnExistingSubCollection(product,subCollection)){
            System.out.println("Product Created");
            System.out.println(product);
        }else{
            System.err.println("Error to create the product!");
        }
    }

    public static boolean variantPants(VariantPants variantPants){
        boolean allComplete = false;
        try {
            System.out.println("#### Product Variants: ####");

            System.out.println("* Colors (Yellow, Purple, Salmon, Blue, Red, Green, Gray, Black, White)");
            System.out.println("Select a color: ");
            variantPants.setColor(Color.valueOf(scan.nextLine().toUpperCase()));

            System.out.println("* Gender (Female, Male, Kids, Others)");
            System.out.println("Select a Gender: ");
            variantPants.setGender(Gender.valueOf(scan.nextLine().toUpperCase()));

            System.out.println("* Size (S, S/M, M, MT, L, LT,");
            System.out.println("XL, XXL, XLT, XXS, XS)");
            System.out.println("Select a Size: ");
            variantPants.setSizePants(SizePants.valueOf("_"+scan.nextLine().toUpperCase()));

            System.out.println("* Activity (Sport, Casual, Social)");
            System.out.println("Select a Activity: ");
            variantPants.setActivity(Activity.valueOf(scan.nextLine().toUpperCase()));

            System.out.println("* Materials (Jeans, Canvas, Lace, Polyester, Linen, Satin)");
            System.out.println("Select a Materials: ");
            variantPants.setMaterial(Material.valueOf(scan.nextLine().toUpperCase()));

            if(variantPants.getMaterial() != null){
                allComplete = true;
            }

        }catch (Exception err){
            System.err.println("Variant Unavailable");
        }
        return allComplete;
    }
}
