package views.collection;

import models.Product;

import java.util.Scanner;


public final class SubCollectionView {

	static Scanner input = new Scanner(System.in);

	public static void createSubCollection() {
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

			System.out.print("Main Collection: ");
//			MainCollection mainCollection = mainCollectionService.findByName(input.nextLine());
//			mainCollection.addSubCollection(subCollectionService.save(new SubCollection(name, description, keywords)));

			System.out.println("SUB COLLECTION CREATED");
		} catch (Exception e) {
			System.out.println("An error was identified during product creation");
			System.out.println(e.getMessage());
		} finally {
			CollectionManagmentView.collectionMenu();
		}
	}

	public static void searchProductInSubCollection() {
		try {
			System.out.print("Search by sub collection name: ");
			String subCollectionName = input.nextLine();

			//SubCollection subCollection = SubCollection.findSubCollectionByName(subCollectionName);

			System.out.println("List of Products:");
//			for (Product product : subCollection.getProducts()) {
//				System.out.println("Name: " + product.getName());
//				System.out.println("Name: " + product.getPrice());
//				System.out.println("Name: " + product.getDescription());
//				System.out.println(" = = = = = =");
//			}
		} catch (Exception e) {
			System.out.println("An error was identified during searching product");
			System.out.println(e.getMessage());
		} finally {
			CollectionManagmentView.collectionMenu();
		}

	}

}
