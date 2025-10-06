package parkingLotDesign.ticket;

import parkingLotDesign.parkingSpot.ParkingSpot;
import parkingLotDesign.vehicle.Vehicle;

public class Ticket {
    int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getEntryTime() {
        return entryTime;
    }
    public void setEntryTime(int entryTime) {
        this.entryTime = entryTime;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
    int entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
}
