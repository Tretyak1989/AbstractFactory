import Interfaces.Computer;
import Interfaces.DeviceFactory;
import Interfaces.MobilePhone;
import Interfaces.PhotoCamera;

/**
 * Created by Андрей on 04.12.2016.
 */
public class TestFactory {
    public static void main(String[] args) {

        DeviceFactory factory = getFactory("dasd");

        Computer computer = factory.getComputer();
        MobilePhone mobilePhone = factory.getMobilePhone();
        PhotoCamera photoCamera = factory.getPhotoCamera();

        computer.NameOfBrand();
        computer.MatheBoard();
        computer.Pricessor();
        System.out.println();

        mobilePhone.NameOfBrand();
        mobilePhone.Body();
        mobilePhone.Camera();
        mobilePhone.Skrin();
        System.out.println();

        photoCamera.NameOfBrand();
        photoCamera.MegaPixels();
        photoCamera.lens();
        System.out.println();
    }

    public static DeviceFactory getFactory(String lang){
        switch (lang){
            case "Usa":
                return new UsaDeviceFactory();
            case "China":
                return new ChinaDevicefactory();
            default:
                throw new RuntimeException("Unknown device fabric");
        }
    }
}
