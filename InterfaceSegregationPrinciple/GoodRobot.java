package InterfaceSegregationPrinciple;

public class GoodRobot implements Workable {

    @Override
    public void work() {
        System.out.println("Robot is working...");
    }
    
}
