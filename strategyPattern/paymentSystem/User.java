package strategyPattern.paymentSystem;

public class User {
    private final CheckOutStrategy checkOutStrategy;
    public User(CheckOutStrategy checkOutStrategy){
        this.checkOutStrategy=checkOutStrategy;
    }
    public void checkout(){
        checkOutStrategy.checkout();
    }
}
