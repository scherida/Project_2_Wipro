package view.product;

import java.util.Scanner;

public class ProductManagementMenu {
    static Scanner scan = new Scanner(System.in);

    public static int productMenu() {
        System.out.println("#### OPTIONS ####");
        System.out.println("1- Create new product");
        System.out.println("2- List all products");
        System.out.println("3- Search by name");
        System.out.println("0- Return");

        return Integer.parseInt(scan.nextLine());
    }

    public static int variantsMenu() {
        System.out.println("#### What is the type of product? ####");
        System.out.println("1- TShirt");
        System.out.println("2- Pants");
        System.out.println("3- Sneakers");
        System.out.println("4- Others");
        System.out.println("0- Return");

        return Integer.parseInt(scan.nextLine());
    }

}
