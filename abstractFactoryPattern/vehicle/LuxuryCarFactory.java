package abstractFactoryPattern.vehicle;

public class LuxuryCarFactory implements CarFactory{

    private String brand;
    public LuxuryCarFactory(String brand){
        this.brand=brand;

    }

    @Override
    public CarExterior createExterior() {
        return new LuxuryCarExterior();
    }

    @Override
    public CarInterior createInterior() {
       return new LuxuryCarInterior();
    }
    
}
