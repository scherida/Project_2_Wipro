package views.product;

import java.util.Scanner;

public final class VariantProductView {

	static Scanner input = new Scanner(System.in);

	protected static void variant(Long id) {
		Integer value;

		try {
			do {
				System.out.println("Enter the number that corresponds to one of the options below");
				System.out.println("Does it product have a variant?");
				System.out.println("1 - Yes");
				System.out.println("2 - No");
				value = input.nextInt();
				input.nextLine();

				switch (value) {
					case 1:
						System.out.println("VARIANT PRODUCT");
						createVariant(id);
						break;

					case 2:
						System.out.println("PRODUCT CREATED!");
						break;
					default:
						break;
				}
			} while (value != 1 || value != 2);
			ProductManagementView.productMenu();
		} catch (Exception e) {
			System.out.println("Enter with valid number! (1 or 2)");
			System.out.println(e.getMessage());
			variant(id);
		}

	}

	private static void createVariant(Long id) {
		Integer value;

		try {
			do {
				System.out.println("Enter the number that corresponds to one of the options below");
				System.out.println("Enter the number variant?");
				System.out.println("1 - T-Shirt");
				System.out.println("2 - Sneakers");
				System.out.println("3 - Pants");
				value = input.nextInt();
				input.nextLine();

				switch (value) {
					case 1:
						System.out.println("T-SHIRT");
						ProductsView.createTshirt(id);
						System.out.println("T-SHIRT CREATED!");
						break;

					case 2:
						System.out.println("SNEAKERS");
						ProductsView.createSneakers(id);
						System.out.println("SNEAKERS CREATED!");
						break;

					case 3:
						System.out.println("PANTS");
						ProductsView.createPants(id);
						System.out.println("PANTS CREATED!");
						break;
					default:
						break;
				}
			} while (value != 1 || value != 2 || value != 3);
			ProductManagementView.productMenu();
		} catch (Exception e) {
			System.out.println("Enter with valid number! (1 or 2 or 3)");
			System.out.println(e.getMessage());
			createVariant(id);
		}
	}

}
