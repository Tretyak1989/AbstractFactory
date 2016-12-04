import ChinaFactory.ChinaComputer;
import ChinaFactory.ChinaMobilePhone;
import ChinaFactory.ChinaPhotoCamera;
import Interfaces.Computer;
import Interfaces.DeviceFactory;
import Interfaces.MobilePhone;
import Interfaces.PhotoCamera;

/**
 * Created by Андрей on 04.12.2016.
 */
public class ChinaDevicefactory implements DeviceFactory {
    @Override
    public Computer getComputer() {
        return new ChinaComputer();
    }

    @Override
    public MobilePhone getMobilePhone() {
        return new ChinaMobilePhone();
    }

    @Override
    public PhotoCamera getPhotoCamera() {
        return new ChinaPhotoCamera();
    }
}
