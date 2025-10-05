package parkingLotDesign.parkingSpotManager;

public class NearToEntrance extends ParkingStrategy{

    @Override
    public String findSpot() {
        System.out.println("Near to entrance...");
        return "Near to entrance...";
    }
    
}
