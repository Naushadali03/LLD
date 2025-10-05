package parkingLotDesign.entrance;

import parkingLotDesign.parkingSpotManager.ParkingSpotManager;
import parkingLotDesign.parkingSpotManager.ParkingStrategy;
import parkingLotDesign.vehicle.Vehicle;
import parkingLotDesign.vehicle.VehicleType;

public class EntranceGate {
    Vehicle vehicle;
    ParkingManagerFactory parkingManagerFactory;
    ParkingStrategy parkingStrategy;
    public EntranceGate(ParkingManagerFactory parkingManagerFactory,ParkingStrategy parkingStrategy){
        this.parkingManagerFactory=parkingManagerFactory;
        this.parkingStrategy=parkingStrategy;
    }
    public void findSpace(Vehicle vehicle,int entranceGateNumber){
        ParkingSpotManager parkingSpotManager = parkingManagerFactory.getParkingManagerFactory(vehicle.getVehicleType());
        parkingSpotManager.findParkingspace(parkingStrategy);
    }

    public Vehicle bookSpace(Vehicle vehicle){
        ParkingSpotManager parkingSpotManager = parkingManagerFactory.getParkingManagerFactory(vehicle.getVehicleType());
        return parkingSpotManager.addVehicle(vehicle);
    }
}
