package view.images;

import model.Images;
import service.ImageService;
import view.product.ProductView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImagesMenu {
    static Scanner scan = new Scanner(System.in);

    static ImageService imageService = new ImageService();

    public static List<Images> createImagesMenu(){
        int qnt =-1;
        boolean checkQnt;
        List<Images> imagesList = new ArrayList<>();

        do {
            System.out.println("How many images to insert?");
            do{
               try {
                   qnt = Integer.parseInt(scan.nextLine());
               }catch (Exception err){
                   System.err.println("Invalid Number, try again!");
               }
            }while (qnt <0);

            checkQnt = imageService.validQntImages(qnt);
        } while (!checkQnt);
        for (int i = 1; i <= qnt; i++) {
            System.out.println("Image " + i);
            System.out.println("Name");
            String imgName = scan.nextLine();

            long imgSize = ProductView.validSize();

            System.out.println("Path");
            String imgPath = scan.nextLine();
            Images image = new Images(imgName, imgSize, imgPath);
            imagesList.add(image);
        }
        return imagesList;
    }

    public static void limitImages(){
        System.err.println("You can insert only 5 images!");
    }

}
