package UsaFactory;

import Interfaces.MobilePhone;

/**
 * Created by Андрей on 04.12.2016.
 */
public class UsaMobilePhone implements MobilePhone {
    @Override
    public void NameOfBrand() {
        System.out.println("IPhone");
    }

    @Override
    public void Skrin() {
        System.out.println("Retina\n 4.7inch");
    }

    @Override
    public void Camera() {
        System.out.println("12 megapixels");
    }

    @Override
    public void Body() {
        System.out.println("Metal unybody");

    }
}
