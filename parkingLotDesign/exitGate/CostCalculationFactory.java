package parkingLotDesign.exitGate;

import parkingLotDesign.ticket.Ticket;

public class CostCalculationFactory {
   private Ticket ticket;
    public CostCalculationFactory(Ticket ticket){
        this.ticket = ticket;
    }

    public CostCalculation getCostCalculation(){
        switch(ticket.getVehicle().getVehicleType()){
            case TWOWHEELER: return new TwoWheelerCostCalculation();
            case FOURWHEELER: return new FourWheelerCostCalculation();
            default: throw new IllegalArgumentException();
        }
    }
    
}
