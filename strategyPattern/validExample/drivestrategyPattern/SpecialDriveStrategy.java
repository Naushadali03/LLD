package strategyPattern.validExample.drivestrategyPattern;

public class SpecialDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Sport drive capability.....");
    }
    
}
