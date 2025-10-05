package parkingLotDesign.entrance;

import parkingLotDesign.parkingSpotManager.FourWheelerParkingSpotManager;
import parkingLotDesign.parkingSpotManager.ParkingSpotManager;
import parkingLotDesign.parkingSpotManager.TwoWheelerParkingSpotManager;
import parkingLotDesign.vehicle.Vehicle;
import parkingLotDesign.vehicle.VehicleType;

public class ParkingManagerFactory {
    public ParkingSpotManager getParkingManagerFactory(VehicleType vehicleType){
        switch(vehicleType){
            case TWOWHEELER: return new TwoWheelerParkingSpotManager();
            case FOURWHEELER: return new FourWheelerParkingSpotManager();
            default: throw new IllegalArgumentException(); 
        }
    }
}
