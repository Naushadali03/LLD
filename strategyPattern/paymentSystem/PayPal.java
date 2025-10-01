package strategyPattern.paymentSystem;

public class PayPal implements CheckOutStrategy{

    @Override
    public void checkout() {
        System.out.println("Using paypal for checkout....");
    }
    
}
