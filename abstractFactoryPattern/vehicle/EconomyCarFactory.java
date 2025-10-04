package abstractFactoryPattern.vehicle;

public class EconomyCarFactory implements CarFactory{

    String brand;

    public EconomyCarFactory(String brand){
        this.brand=brand;
    }

    @Override
    public CarExterior createExterior() {
        return new EconomyCarExterior();
    }

    @Override
    public CarInterior createInterior() {
        return new EconomyCarInterior();
    }
    
}
