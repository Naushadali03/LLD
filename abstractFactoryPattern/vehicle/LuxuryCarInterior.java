package abstractFactoryPattern.vehicle;

public class LuxuryCarInterior implements CarInterior{

    @Override
    public void addInteriorComponent() {
      System.out.println("Adding basic interior components for Luxury Car.");
    }
    
}
