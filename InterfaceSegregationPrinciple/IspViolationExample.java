package InterfaceSegregationPrinciple;

public class IspViolationExample {
    public static void main(String[] args) {
        Worker robot = new Robot();
        robot.work();
        robot.eat();
    }
}
