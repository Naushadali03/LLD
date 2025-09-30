package strategyPattern.validExample;

public class Main {
    public static void main(String[] args) {
        Vehicle sportVehicle = new SportVehicle();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        Vehicle goodVehicle = new GoodVehicle();
        Vehicle passengerVehicle = new PassengerVehicle();
        sportVehicle.drive();
        offRoadVehicle.drive();
        goodVehicle.drive();
        passengerVehicle.drive();
    }
}
