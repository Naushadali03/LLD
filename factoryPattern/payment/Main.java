package factoryPattern.payment;

public class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payment = paymentFactory.getPayment("UPI");
        payment.paymentType();
        payment = paymentFactory.getPayment("Net Banking");
        payment.paymentType();
        payment = paymentFactory.getPayment("Credit Card");
        payment.paymentType();
    }
}
