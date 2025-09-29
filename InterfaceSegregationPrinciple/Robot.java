package InterfaceSegregationPrinciple;

public class Robot implements Worker {

    @Override
    public void work() {
       System.out.println("Robots are working...");
    }

    @Override
    public void eat() {
       
        throw new UnsupportedOperationException("Robot does not 'eat'");
    }
    
}
