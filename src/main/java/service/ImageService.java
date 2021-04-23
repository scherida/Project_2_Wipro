package service;

import view.images.ImagesMenu;

public class ImageService {

    public boolean validQntImages(int qnt) {
        boolean result = false;
        if (qnt < 6) {
            result = true;
        }else{
            ImagesMenu.limitImages();
        }
        return result;
    }

}
