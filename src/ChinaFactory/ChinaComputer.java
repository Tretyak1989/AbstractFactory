package ChinaFactory;

import Interfaces.Computer;

/**
 * Created by Андрей on 04.12.2016.
 */
public class ChinaComputer implements Computer {
    @Override
    public void NameOfBrand() {
        System.out.println("Chuwi");
    }

    @Override
    public void Pricessor() {
        System.out.println("AMD A8 - 7600");
    }

    @Override
    public void MatheBoard() {
        System.out.println("Asus M5A78L-M LX3 (sAM3+, AMD 760G, PCI-Ex16)");
    }
}
