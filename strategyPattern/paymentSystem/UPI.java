package strategyPattern.paymentSystem;

public class UPI implements CheckOutStrategy{

    @Override
    public void checkout() {
       System.out.println("Using UPI for checkout....");
    }
    
}
