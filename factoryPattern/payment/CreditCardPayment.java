package factoryPattern.payment;

public class CreditCardPayment implements Payment{

    @Override
    public void paymentType() {
        System.out.println("Credit Card Payment...");
    }
    
}
