package parkingLotDesign.entrance;

import parkingLotDesign.parkingSpot.ParkingSpot;
import parkingLotDesign.parkingSpotManager.ParkingSpotManager;
import parkingLotDesign.parkingSpotManager.ParkingStrategy;
import parkingLotDesign.ticket.Ticket;
import parkingLotDesign.vehicle.Vehicle;
import parkingLotDesign.vehicle.VehicleType;

public class EntranceGate {
    Vehicle vehicle;
    ParkingManagerFactory parkingManagerFactory;
    ParkingStrategy parkingStrategy;
    Ticket ticket;
    public EntranceGate(ParkingManagerFactory parkingManagerFactory,ParkingStrategy parkingStrategy,Ticket ticket){
        this.parkingManagerFactory=parkingManagerFactory;
        this.parkingStrategy=parkingStrategy;
        this.ticket=ticket;
    }
    public void findSpace(Vehicle vehicle,int entranceGateNumber){
        ParkingSpotManager parkingSpotManager = parkingManagerFactory.getParkingManagerFactory(vehicle.getVehicleType());
        parkingSpotManager.findParkingspace(parkingStrategy);
    }

    public ParkingSpot bookSpace(Vehicle vehicle){
        ParkingSpotManager parkingSpotManager = parkingManagerFactory.getParkingManagerFactory(vehicle.getVehicleType());
        return parkingSpotManager.addVehicle(vehicle);
    }

    public Ticket getTicket(Vehicle vehicle,ParkingSpot parkingSpot){
        return null;
    }
}
