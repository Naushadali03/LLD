package factoryPattern.vehicle;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicle){
        switch(vehicle){
            case "car": return new Car();
            case "truck": return new Truck();
            case "bike": return new Bike();
        }
        return null;
    }
}
