package factoryPattern.payment;

public class PaymentFactory {
    public Payment getPayment(String paymentType){
        switch(paymentType){
            case "UPI": return new UPIPayment();
            case "Net Banking": return new NetBankingPayment();
            case "Credit Card": return new CreditCardPayment();
        }
        return null;
    }
}
