package parkingLotDesign.parkingSpotManager;

import java.util.List;

import parkingLotDesign.parkingSpot.ParkingSpot;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{

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
    public ParkingSpot addVehicle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addVehicle'");
    }

    @Override
    public void removeVehicle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeVehicle'");
    }
    
}
