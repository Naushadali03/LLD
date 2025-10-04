package factoryPattern.payment;

public class UPIPayment implements Payment{

    @Override
    public void paymentType() {
        System.out.println("UPI Payment....");
    }
    
}
