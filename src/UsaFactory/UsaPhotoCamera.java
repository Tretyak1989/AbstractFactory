package UsaFactory;

import Interfaces.PhotoCamera;

/**
 * Created by Андрей on 04.12.2016.
 */
public class UsaPhotoCamera implements PhotoCamera {
    @Override
    public void NameOfBrand() {
        System.out.println("Kodak");
    }

    @Override
    public void MegaPixels() {
        System.out.println("8");
    }

    @Override
    public void lens() {
        System.out.println("15 - 25 mm");
    }
}
