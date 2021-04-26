package view.collection;

import java.util.Scanner;

public class CollectionManagementMenu {
    static Scanner scan = new Scanner(System.in);

    public static int collectionMenu() {
        System.out.println("#### Collection Menu: ####");
        System.out.println("1- Create new Collection");
        System.out.println("2- Create new Sub Collection");
        System.out.println("3- List Collections/Sub Collections");
        System.out.println("4- Search for a Product in a Sub Collections");
        System.out.println("5- List all Product in a Collections");
        System.out.println("0- Back to main menu");
        System.out.println("###########################");
        return Integer.parseInt(scan.nextLine());
    }
}
