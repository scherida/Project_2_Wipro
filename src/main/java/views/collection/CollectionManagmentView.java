package views.collection;

import java.util.Scanner;

public class CollectionManagmentView {

    static Scanner input = new Scanner(System.in);

    public static void collectionMenu() {
        Integer value;

        do {
            System.out.println("Enter the number that corresponds to one of the options below");
            System.out.println("1 - Create main collection");
            System.out.println("2 - Create subcollection");
            System.out.println("3 - List all products");
            System.out.println("4 - Search product in subcollection");
            System.out.println("0 - Back to main menu");

            value = input.nextInt();
            input.nextLine();

            switch (value) {
                case 1:
                    System.out.println("CREATE MAIN COLLECTION");
                    CollectionManagmentView.createMainCollection();
                    break;

                case 2:
                    System.out.println("CREATE SUBCOLLECTION");
                    SubCollectionView.createSubCollection();
                    break;

                case 3:
                    System.out.println("LIST ALL PRODUCTS");
                    CollectionManagmentView.listAllCollections();
                    break;

                case 4:
                    System.out.println("SEARCH PRODUCT IN SUBCOLLECTION");
                    SubCollectionView.searchProductInSubCollection();
                    break;

                case 0:
                    applications.Store.mainMenu();
                    break;

                default:
                    break;
            }

        } while (value != 0);

    }

    public static void listAllCollections() {
        try {

            System.out.println("List of Main Collections");


        } catch (Exception e) {
            System.out.println("An error was identified during listing products");
            System.out.println(e.getMessage());
        } finally {
            CollectionManagmentView.collectionMenu();
        }
    }

    public static void createMainCollection() {
        try {
            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Description: ");
            String description = input.nextLine();

            System.out.print("Keywords: ");
            String[] keywords = new String[6];

            for (Integer i = 0; i < 6; i++) {
                keywords[i] = input.nextLine();
            }
            input.nextLine();

//			mainCollection.save(new MainCollection(name, description, keywords));

            System.out.println("MAIN COLLECTION CREATED");
        } catch (Exception e) {
            System.out.println("An error was identified during collection creation");
            System.out.println(e.getMessage());
        } finally {
            CollectionManagmentView.collectionMenu();
        }
    }

}
