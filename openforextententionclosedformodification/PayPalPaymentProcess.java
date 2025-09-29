package openforextententionclosedformodification;

public class PayPalPaymentProcess extends ProcessPayment {

    @Override
    public void processPayment(double amount) {
       System.out.println("Processing the pay pal payment: "+amount);
    }
}
