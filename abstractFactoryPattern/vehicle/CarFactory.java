package abstractFactoryPattern.vehicle;

public interface CarFactory {
    CarExterior createExterior();
    CarInterior createInterior();

    public default void produceCompleteCar(){
        System.out.println("Starting complete vehicle production...");
        CarInterior carInterior = createInterior();
        CarExterior carExterior = createExterior();
        carExterior.addExteriorComponent();
        carInterior.addInteriorComponent();;
        System.out.println("Vehicle production completed!");
    }
}
