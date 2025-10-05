package parkingLotDesign.parkingSpotManager;

import java.util.List;

import parkingLotDesign.parkingSpot.ParkingSpot;
import parkingLotDesign.parkingSpot.TwoWheelerParkingSpot;
import parkingLotDesign.vehicle.Vehicle;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{

    public TwoWheelerParkingSpotManager(){}

    public TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpots,ParkingStrategy parkingStrategy) {
        super(parkingSpots,parkingStrategy);
    }

    @Override
    public ParkingSpot findParkingspace(ParkingStrategy parkingStrategy) {
        parkingStrategy.findSpot();
        return null;
       
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
        ParkingSpot parkingSpot = new TwoWheelerParkingSpot();
        parkingSpot.setVehicle(vehicle);
        super.parkingSpot.add(parkingSpot.parkingVehicle(vehicle));

        return vehicle;
    }

    @Override
    public void removeVehicle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeVehicle'");
    }
    
}
