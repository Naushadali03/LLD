package strategyPattern.paymentSystem;

public class Main {
    public static void main(String[] args) {
        User user = new User(new UPI());
        User user1 = new User(new CreditCard());
        User user2 = new User(new NetBanking());
        user.checkout();
        user1.checkout();
        user2.checkout();
    }
}
