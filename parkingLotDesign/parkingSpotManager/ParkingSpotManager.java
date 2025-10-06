package parkingLotDesign.parkingSpotManager;

import java.util.ArrayList;
import java.util.List;

import parkingLotDesign.parkingSpot.ParkingSpot;
import parkingLotDesign.vehicle.Vehicle;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpot=new ArrayList<>();
    ParkingStrategy parkingStrategy;
    public ParkingSpotManager(){}
    public ParkingSpotManager(List<ParkingSpot> parkingSpots,ParkingStrategy parkingStrategy){
        this.parkingSpot=parkingSpots;
        this.parkingStrategy=parkingStrategy;
    }
   public abstract ParkingSpot findParkingspace(ParkingStrategy parkingStrategy);
   public abstract void addParkingSpace();
   public abstract void removeParkingSpace();
   public abstract ParkingSpot addVehicle(Vehicle vehicle);
   public abstract void removeVehicle();
}
