package NullObjectDesignPattern;

public class VehicleFactory {
    public Vehicle getVehicle(VehicleType vehicleType){
        if(vehicleType==VehicleType.CAR){
            return new Car();
        }
        return new NullObject();
    }
}
