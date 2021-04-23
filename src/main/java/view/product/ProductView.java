package view.product;

import model.Product;
import service.ProductService;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    static Scanner scan = new Scanner(System.in);
    static ProductService productService = new ProductService();

    public static String productName(){
        System.out.println("What is the product that you are looking for?");
        return scan.nextLine();
    }

    public static void productsIsEmpty(){
        if(!productService.productsIsEmpty()){
            System.err.println("Nothing Registered, Create a new product.");
        }
    }

    public static void listAllProducts() {
        System.out.println("All products listed");
        System.out.println("======================");
        boolean print = productService.listProducts(); //ok
        System.out.println();
        if (!print) {
            System.err.println("Nothing Registered, Create a new product.");
        }
    }
    public static void searchByName(){
        List<Product> products = productService.searchByName(ProductView.productName());//ok
        if (!products.isEmpty()){
            for (Product product : products) {
                System.out.println(
                        "Product Name: " + product.getName() +
                                "\nPrice: " + product.getPrice() +
                                "\nDescription: " + product.getDescription()+"\n"
                );
            }
        }
    }

    public static double validPrice(){
        double price =-1;
        do{
            System.out.println("Product price: ");
            try{
                price = Double.parseDouble(scan.nextLine());
            }catch (InputMismatchException | NumberFormatException err){
                System.err.println("Invalid Number, try again");
            }
        }while(price<0);
        return price;
    }

    public static int validQuantity() {
        int quantity = -1;
        do{
            System.out.println("Quantity: ");
            try{
                quantity = Integer.parseInt(scan.nextLine());
            }catch (InputMismatchException | NumberFormatException err){
                System.err.println("Invalid Number, try again");
            }
        }while(quantity<0);
        return quantity;
    }

    public static long validSize() {
        long size = -1;
        do{
            System.out.println("Size");
            try{
                size = Long.parseLong(scan.nextLine());
            }catch (InputMismatchException | NumberFormatException err){
                System.err.println("Invalid Number, try again");
            }
        }while(size<0);
        return size;
    }

}
