package strategyPattern.validExample;

import strategyPattern.validExample.drivestrategyPattern.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super(new SpecialDriveStrategy());
    }
}
