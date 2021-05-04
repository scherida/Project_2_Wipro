package service;

public class ImageService {

    public boolean validQntImages(int qnt) {
        boolean result = false;
        if (qnt < 6) {
            result = true;
        }else{
            System.err.println("You can insert only 5 images!");
        }
        return result;
    }

}
