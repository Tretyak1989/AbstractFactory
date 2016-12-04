package UsaFactory;

import Interfaces.Computer;

/**
 * Created by Андрей on 04.12.2016.
 */
public class UsaComputer implements Computer {
    @Override
    public void NameOfBrand() {
        System.out.println("Micrasofr - surFace Book");
    }

    @Override
    public void Pricessor() {
        System.out.println("Intel i5 - 6600m");

    }

    @Override
    public void MatheBoard() {
        System.out.println("Unknown");
    }
}
