package abstractFactoryPattern.vehicle;

public class CarFactoryProvider {
    public CarFactory getCar(CarType type, String brand){
        switch(type){
            case ECONOMY : return new EconomyCarFactory(brand);
            case LUXURY : return new LuxuryCarFactory(brand);
            default:
                 throw new IllegalArgumentException("Unknown car type:" + type);
        }
    }
}
