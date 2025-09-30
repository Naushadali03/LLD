package strategyPattern.validExample;

import strategyPattern.validExample.drivestrategyPattern.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
