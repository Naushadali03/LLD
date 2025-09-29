package openforextententionclosedformodification;

public class CreditCardPaymentProcessor extends ProcessPayment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing the credit card payment "+amount);
    }
    
}
