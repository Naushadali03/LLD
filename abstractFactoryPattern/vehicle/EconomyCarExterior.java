package abstractFactoryPattern.vehicle;

public class EconomyCarExterior implements CarExterior{

    @Override
    public void addExteriorComponent() {
        System.out.println("Adding basic exterior components for Economy Car.");
    }
    
}
