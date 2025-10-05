package parkingLotDesign.parkingSpotManager;

import java.util.List;

import parkingLotDesign.parkingSpot.ParkingSpot;
import parkingLotDesign.vehicle.Vehicle;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{

    public FourWheelerParkingSpotManager(){}

    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpots,ParkingStrategy parkingStrategy) {
        super(parkingSpots,parkingStrategy);
    }

    @Override
    public ParkingSpot findParkingspace(ParkingStrategy parkingStrategy) {
        // TODO Auto-generated method stub
        parkingStrategy.findSpot();
        throw new UnsupportedOperationException("Unimplemented method 'findParkingspace'");
    }

    @Override
    public void addParkingSpace() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addParkingSpace'");
    }

    @Override
    public void removeParkingSpace() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeParkingSpace'");
    }

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        // TODO Auto-generated method stub
        
        return vehicle;
    }

    @Override
    public void removeVehicle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeVehicle'");
    }

    
}
