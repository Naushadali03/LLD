package parkingLotDesign.parkingSpot;

import parkingLotDesign.vehicle.Vehicle;

public class FourWheelerParkingSpot extends ParkingSpot {

    @Override
    public ParkingSpot parkingVehicle(Vehicle vehicle) {
        ParkingSpot parkingSpot = new FourWheelerParkingSpot();
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setEmpty(false);
        return parkingSpot;
    }

    @Override
    public ParkingSpot removeVehicle(int id) {
        ParkingSpot parkingSpot = new FourWheelerParkingSpot();
        parkingSpot.setVehicle(null);
        parkingSpot.setEmpty(true);
        return parkingSpot;
    }

    public int price() {
        return 20;
    }

}
