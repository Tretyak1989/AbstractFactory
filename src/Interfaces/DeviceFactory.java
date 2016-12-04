package Interfaces;

/**
 * Created by Андрей on 04.12.2016.
 */
public interface DeviceFactory {
    Computer getComputer();
    MobilePhone getMobilePhone();
    PhotoCamera getPhotoCamera();
}
