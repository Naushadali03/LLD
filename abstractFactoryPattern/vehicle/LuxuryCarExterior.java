package abstractFactoryPattern.vehicle;

public class LuxuryCarExterior implements CarExterior{

    @Override
    public void addExteriorComponent() {
       System.out.println("Adding basic exterior components for Luxury Car.");
    }
    
}
