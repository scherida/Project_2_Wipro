package applications;

import views.collection.CollectionManagmentView;
import views.product.ProductManagementView;

import java.util.Scanner;

public class Store {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Integer value;

        do {
            System.out.println("Enter the number that corresponds to one of the options below");
            System.out.println("1 - Product Managment");
            System.out.println("2 - Collection Managment");
            System.out.println("0 - Exit");

            value = input.nextInt();
            input.nextLine();

            switch (value) {
                case 1:
                    System.out.println("PRODUCT MANAGMENT");
                    ProductManagementView.productMenu();
                    break;

                case 2:
                    System.out.println("COLLECTION MANAGMENT");
                    CollectionManagmentView.collectionMenu();
                    break;

                case 0:
                    System.out.println("SAINDO DO SISTEMA...");
                    break;

                default:
                    break;
            }

        } while (value != 0);

    }
}
