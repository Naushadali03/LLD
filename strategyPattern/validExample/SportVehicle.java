package strategyPattern.validExample;

import strategyPattern.validExample.drivestrategyPattern.SpecialDriveStrategy;

public class SportVehicle extends Vehicle {
    public SportVehicle(){
        super(new SpecialDriveStrategy());
    }
}
