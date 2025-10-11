package ATMWithdrawalSystem;

public abstract class MoneyHandler {
    protected MoneyHandler moneyHandler;
    protected int level;
    public void setNextDoor(MoneyHandler moneyHandler){
        this.moneyHandler=moneyHandler;
    }
    public void processTransaction(int amount) {
        int remainder = process(amount);
        if (moneyHandler != null && remainder > 0) {
            moneyHandler.processTransaction(remainder);
        }
    }

    public abstract int process(int amount);
}
