package factoryPattern.vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle("car");
        vehicle.drive();
        vehicle = vehicleFactory.getVehicle("truck");
        vehicle.drive();
        vehicle = vehicleFactory.getVehicle("bike");
        vehicle.drive();
    }
}
