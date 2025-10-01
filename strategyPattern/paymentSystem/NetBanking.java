package strategyPattern.paymentSystem;

public class NetBanking implements CheckOutStrategy{

    @Override
    public void checkout() {
        System.out.println("Using Net Banking for checkout...");
    }
    
}
