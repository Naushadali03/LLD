package strategyPattern.validExample;

import strategyPattern.validExample.drivestrategyPattern.DriveStrategy;

public class Vehicle {
    private final DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
