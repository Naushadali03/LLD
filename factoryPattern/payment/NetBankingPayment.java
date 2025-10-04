package factoryPattern.payment;

public class NetBankingPayment implements Payment{

    @Override
    public void paymentType() {
       System.out.println("Net Banking Payment...");
    }
    
}
