package parkingLotDesign.parkingSpotManager;

import java.util.List;

import parkingLotDesign.parkingSpot.ParkingSpot;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{

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
