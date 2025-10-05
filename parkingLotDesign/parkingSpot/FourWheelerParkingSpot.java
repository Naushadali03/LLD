package parkingLotDesign.parkingSpot;

import parkingLotDesign.vehicle.Vehicle;

public class FourWheelerParkingSpot extends ParkingSpot{

    @Override
    public void parkingVehicle(Vehicle vehicle) {
        super.vehicle=vehicle;
        super.isEmpty=false;
    }

    @Override
    public void removeVehicle(int id) {
        super.vehicle=null;
        super.isEmpty=true;
    }

    public int price(){
        return 20;
    }
    
}
