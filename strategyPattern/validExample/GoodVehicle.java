package strategyPattern.validExample;

import strategyPattern.validExample.drivestrategyPattern.NormalDriveStrategy;

public class GoodVehicle extends Vehicle {
    public GoodVehicle(){
        super(new NormalDriveStrategy());
    }
}
