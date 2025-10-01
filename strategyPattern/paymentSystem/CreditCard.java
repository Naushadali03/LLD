package strategyPattern.paymentSystem;

public class CreditCard implements CheckOutStrategy {

    @Override
    public void checkout() {
        System.out.println("Uisng credit card for checkout....");
    }
    
}
