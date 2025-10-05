package parkingLotDesign.parkingSpot;

import parkingLotDesign.vehicle.Vehicle;

public abstract class ParkingSpot {
    int id;
    boolean isEmpty;
    Vehicle vehicle;
    int price;
    public abstract void parkingVehicle(Vehicle vehicle);
    public abstract void removeVehicle(int id);
}
