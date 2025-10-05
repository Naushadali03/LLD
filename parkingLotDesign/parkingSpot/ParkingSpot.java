package parkingLotDesign.parkingSpot;

import parkingLotDesign.vehicle.Vehicle;

public abstract class ParkingSpot {
    int id;
    boolean isEmpty;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isEmpty() {
        return isEmpty;
    }
    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    Vehicle vehicle;
    int price;
    public abstract ParkingSpot parkingVehicle(Vehicle vehicle);
    public abstract ParkingSpot removeVehicle(int id);
}
