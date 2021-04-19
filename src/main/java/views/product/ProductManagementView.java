package views.product;

import models.Image;
import services.ProductService;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductManagementView {

    public static ProductService productService = new ProductService();
    static Scanner input = new Scanner(System.in);

    public static void productMenu() {
        Integer value;

        do {
            System.out.println("Enter the number that corresponds to one of the options below");
            System.out.println("0 - Back to main menu");
            System.out.println("1 - Create product");
            System.out.println("2 - Search a product by name");
            System.out.println("3 - List all products");


            value = input.nextInt();
            input.nextLine();

            switch (value) {
                case 0:
                    applications.Store.mainMenu();
                    break;

                case 1:
                    System.out.println("CREATE PRODUCT");
                    ProductManagementView.createProduct();
                    break;

                case 2:
                    System.out.println("SEARCH PRODUCT BY NAME");
                    ProductManagementView.findProductByName();
                    break;

                case 3:
                    System.out.println("LIST ALL PRODUCTS");
                    ProductManagementView.findAll();
                    break;

                default:
                    break;
            }

        } while (value != 0);

    }

    public static void createProduct() {
        try {
            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Price: R$ ");
            Double price = input.nextDouble();
            input.nextLine();

            System.out.print("Description: ");
            String description = input.nextLine();

            System.out.print("Quantity: ");
            Integer quantity = input.nextInt();
            input.nextLine();

            //System.out.println("Sub Collection: ");

            System.out.println("Images: ");
            Set<Image> images = new HashSet<>(5);

            //productService.save(new Variant(name, price, description, quantity, subCollection, images));

        } catch (Exception e) {
            System.out.println("An error was identified during product creation");
            System.out.println(e.getMessage());
        } finally {
            ProductManagementView.productMenu();
        }
    }


    public static void findProductByName() {
        try {
//			System.out.print("Search by product name: ");
//			String name = input.nextLine();
//			List<Product> products = productService.findByName(name);
//
//			System.out.println("List of products");
//
//			for (Product product : products) {
//				System.out.println("Name: "+product.getName());
//				System.out.println("Price: "+product.getPrice());
//				System.out.println("Description: "+product.getDescription());
//				System.out.println("= = = = =");
//			}

        } catch (Exception e) {
            System.out.println("An error was identified during searching products");
            System.out.println(e.getMessage());
        }finally {
            ProductManagementView.productMenu();
        }
    }


    public static void findAll() {
        try {
//			List<Product> products = productService.findAll();
//
//			System.out.println("List of products");
//
//			for (Product product : products) {
//				System.out.println("Name: "+product.getName());
//				System.out.println("Price: "+product.getPrice());
//				System.out.println("Description: "+product.getDescription());
//				System.out.println("= = = = =");
//			}

        } catch (Exception e) {
            System.out.println("An error was identified during listing products");
            System.out.println(e.getMessage());
        }finally {
            ProductManagementView.productMenu();
        }

    }
}
