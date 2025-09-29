package openforextententionclosedformodification;

public class PaymentMain {
    public static void paymentProcess(ProcessPayment process,double amount){
        process.processPayment(amount);
    }
    public static void main(String[] args) {
        CreditCardPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentProcessor();
        PayPalPaymentProcess payPalmentProcess = new PayPalPaymentProcess();
        paymentProcess(creditCardPaymentProcessor, 120.0);
        paymentProcess(payPalmentProcess, 110.0);
    }
}
