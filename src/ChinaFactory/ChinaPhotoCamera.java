package ChinaFactory;

import Interfaces.PhotoCamera;

/**
 * Created by Андрей on 04.12.2016.
 */
public class ChinaPhotoCamera implements PhotoCamera{
    @Override
    public void NameOfBrand() {
        System.out.println("Canon");
    }

    @Override
    public void MegaPixels() {
        System.out.println("10 - megapixels");
    }

    @Override
    public void lens() {
        System.out.println("70 - 200 mm");

    }
}
