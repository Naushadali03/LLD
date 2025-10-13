package NullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.getVehicle(VehicleType.CAR);
        System.out.println("The tank capacity for car is "+car.getTankCapacity());
        System.out.println("The seat capacity for car is: "+car.getSeatCapacity());
        Vehicle bike = vehicleFactory.getVehicle(VehicleType.BIKE);
        System.out.println("The tank capacity for bike: "+bike.getTankCapacity());
        System.out.println("The seat capacity for bike: "+bike.getSeatCapacity());

    }
}
