package InterfaceSegregationPrinciple;

public class IspExample {
    public static void main(String[] args) {
        Workable robot = new GoodRobot();
        robot.work();
        GoodHuman human = new GoodHuman();
        human.eat();
        human.work();
    }
}
