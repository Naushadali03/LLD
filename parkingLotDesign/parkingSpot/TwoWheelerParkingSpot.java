package parkingLotDesign.parkingSpot;

import parkingLotDesign.vehicle.Vehicle;

public class TwoWheelerParkingSpot extends ParkingSpot{

    @Override
    public ParkingSpot parkingVehicle(Vehicle vehicle) {
        ParkingSpot parkingSpot = new TwoWheelerParkingSpot();
       parkingSpot.setVehicle(vehicle);
       parkingSpot.setEmpty(false);
       return parkingSpot;
    }

    @Override
    public ParkingSpot removeVehicle(int id) {
        ParkingSpot parkingSpot = new TwoWheelerParkingSpot();
        parkingSpot.setVehicle(null);
        parkingSpot.setEmpty(true);
        return parkingSpot;
    }

    public int price(){
        return 10;
    }
    
}
