package ChinaFactory;

import Interfaces.MobilePhone;

/**
 * Created by Андрей on 04.12.2016.
 */
public class ChinaMobilePhone implements MobilePhone {
    @Override
    public void NameOfBrand() {
        System.out.println("Xiaomi");
    }

    @Override
    public void Skrin() {
        System.out.println("HD\n diagonal - 5 inch");
    }

    @Override
    public void Camera() {
        System.out.println("8 megapixels");
    }

    @Override
    public void Body() {
        System.out.println("Plastic");
    }
}
