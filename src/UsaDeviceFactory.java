import Interfaces.Computer;
import Interfaces.DeviceFactory;
import Interfaces.MobilePhone;
import Interfaces.PhotoCamera;
import UsaFactory.UsaComputer;
import UsaFactory.UsaMobilePhone;
import UsaFactory.UsaPhotoCamera;

/**
 * Created by Андрей on 04.12.2016.
 */
public class UsaDeviceFactory implements DeviceFactory {

    @Override
    public Computer getComputer() {
        return new UsaComputer();
    }

    @Override
    public MobilePhone getMobilePhone() {
        return new UsaMobilePhone();
    }

    @Override
    public PhotoCamera getPhotoCamera() {
        return new UsaPhotoCamera();
    }
}
