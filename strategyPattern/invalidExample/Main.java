package strategyPattern.invalidExample;

public class Main {
    public static void main(String[] args) {
        Vehicle offRoadVehicle = new OffRoadVehicle();
        Vehicle sportVehicle = new SportVehicle();
        Vehicle passengerVehicle = new PassengerVehicle();
        offRoadVehicle.drive();
        sportVehicle.drive();
        passengerVehicle.drive();
    }
}
