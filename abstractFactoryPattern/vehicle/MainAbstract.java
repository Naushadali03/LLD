package abstractFactoryPattern.vehicle;

public class MainAbstract {
    public static void main(String[] args) {
        CarFactoryProvider carFactoryProvider = new CarFactoryProvider();
        CarFactory economy = carFactoryProvider.getCar(CarType.ECONOMY, "Honda");
        economy.produceCompleteCar();
        CarFactory luxury = carFactoryProvider.getCar(CarType.LUXURY, "Mercedes");
        luxury.produceCompleteCar();
    }
}
