
import view.collection.CollectionManagementMenu;
import view.collection.CollectionView;
import view.product.*;

import java.util.Scanner;

public class AppStore {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu(){
        int option = -1;
        do {
            AppStore.mainMenuManagement();
            try {
                option = Integer.parseInt(scan.nextLine());
                switch (option) {
                    case 1:
                        int productManagementOption = ProductManagementMenu.productMenu();
                        switch (productManagementOption){
                            case 1:
                                int typeProduct = ProductManagementMenu.variantsMenu();
                                switch (typeProduct){
                                    case 1:
                                        TShirtView.createTShirtMenu();
                                        break;
                                    case 2:
                                        PantsView.createPants();
                                        break;
                                    case 3:
                                        SneakersView.createSneakersMenu();
                                        break;
                                    case 4:
                                        OthersView.createProduct();
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        AppStore.mainMenuManagement();
                                        break;
                                }
                                break;
                            case 2:
                                ProductView.listAllProducts();
                                break;
                            case 3:
                                ProductView.searchByName();
                            case 0:
                                break;
                            default:
                                AppStore.mainMenuManagement();
                                break;
                        }
                        break;

                    case 2:
                        int collectionManagementOption = CollectionManagementMenu.collectionMenu();
                        switch (collectionManagementOption){
                            case 1:
                                CollectionView.createCollectionMenu(CollectionView.collectionName());
                                break;
                            case 2:
                                CollectionView.createSubCollectionMenu(CollectionView.subCollectionName());
                                break;
                            case 3:
                                CollectionView.listCollectionsAndSubCollections();
                                break;
                            case 4:
                                CollectionView.searchInSubCollection();
                                break;
                            case 5:
                                CollectionView.listProductInASubCollection();
                                break;
                            case 0:
                                break;
                            default:
                                AppStore.mainMenuManagement();
                                break;
                        }
                        break;
                    case 0:
                        System.out.println("Exiting");
                        System.exit(0);
                        break;
                    default:
                        AppStore.mainMenuManagement();
                        break;
                }
            }catch (Exception err){
                System.err.println("Something wrong");
            }
            
        } while (option != 0);
    }

    public static void mainMenuManagement(){
        System.out.println("What do you like to do:");
        System.out.println("1 - Product Management");
        System.out.println("2 - Collection Management");
        System.out.println("0 - Exit");
    }

    public static void invalidOption(){
        System.err.println("Invalid Option");
    }
}
