package views.product;

import models.Image;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public final class ProductsView {

	static Scanner input = new Scanner(System.in);

	protected static void createTshirt(Long id) {
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

			//System.out.println("Sub Collection: "); - Preciso ver depois

			System.out.println("Images: ");
			Set<Image> images = new HashSet<>(5);

			System.out.println("Colors (Blue, Red, Green, Gray, Black, White, Yellow, Brown, Orange)");
			System.out.print("Color: ");
			String color = String.valueOf(input.nextLine());

			System.out.println("Size (XS, S, M, L, XL, XXL, XXXL)");
			System.out.print("Size: ");
			String size = String.valueOf(input.nextLine());

			System.out.println("Gender (Female, Male, Unisex)");
			System.out.print("Gender: ");
			String gender = String.valueOf(input.nextLine());

			System.out.println("Sleeve (Short, Long)");
			System.out.print("Sleeve: ");
			String sleeve = String.valueOf(input.nextLine());

//			tShirtService.save(
//					new TShirt(name, price, description, quantity, subCollection, images, color, size, gender, sleeve));

		} catch (Exception e) {
			System.out.println("An error was identified during product creation");
			System.out.println(e.getMessage());
			VariantProductView.variant(id);
		} finally {
			ProductManagementView.productMenu();
		}
	}

	protected static void createSneakers(Long id) {
		try {
			System.out.print("Name: ");

			System.out.print("Price: R$ ");

			System.out.print("Description: ");

			System.out.print("Quantity: ");


			System.out.println("Sub Collection: ");

			System.out.println("Images: ");
			Set<Image> images = new HashSet<>(5);

			System.out.println("Colors (Blue, Red, Green, Gray, Black, White, Yellow, Brown, Orange)");
			System.out.print("Color: ");

			System.out.println("Size (30-31, 32-33,34-35, 36-37, 38-39, 40-41, 42-43, 44-45, 46-47, 48-49, 50-51)");
			System.out.print("Size: ");

			System.out.println("Gender (Female, Male, Unisex)");
			System.out.print("Gender: ");

			System.out.println("Activity (Sport, Social, Hiking, Running)");
			System.out.print("Activity: ");

//			Sneakers.save(new Sneakers(name, price, description, quantity, subCollection, images, color, size, gender,
//					activity));

		} catch (Exception e) {
			System.out.println("An error was identified during product creation");
			System.out.println(e.getMessage());
			VariantProductView.variant(id);
		} finally {
			ProductManagementView.productMenu();
		}
	}

	protected static void createPants(Long id) {
		try {
			System.out.print("Name: ");

			System.out.print("Price: R$ ");

			System.out.print("Description: ");

			System.out.print("Quantity: ");

			System.out.println("Sub Collection: ");

			System.out.println("Images: ");
			Set<Image> images = new HashSet<>(5);

			System.out.println("Colors (Blue, Red, Green, Gray, Black, White, Yellow, Brown, Orange)");
			System.out.print("Color: ");

			System.out.println("Size (36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58)");
			System.out.print("Size: ");

			System.out.println("Gender (Female, Male, Unisex)");
			System.out.print("Gender: ");

			System.out.println("Activity (Sport, Social, Hiking, Running)");
			System.out.print("Activity: ");

			System.out.println("Material (Jeans, Chino, Twill, Leather, Cotton, Velvet)");
			System.out.print("Material: ");

//			Pants.save(new Pants(name, price, description, quantity, subCollection, images, color, size, gender,
//					activity, material));

		} catch (Exception e) {
			System.out.println("An error was identified during product creation");
			System.out.println(e.getMessage());
			VariantProductView.variant(id);
		} finally {
			ProductManagementView.productMenu();
		}
	}
}
