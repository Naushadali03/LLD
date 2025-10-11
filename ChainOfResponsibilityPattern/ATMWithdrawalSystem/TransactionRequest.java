package ATMWithdrawalSystem;

public class TransactionRequest {
    public static void main(String[] args) {

        MoneyHandler moneyHandler = getChainOfMoneyHandler();

        moneyHandler.processTransaction(3700);
        
    }
    public static MoneyHandler getChainOfMoneyHandler(){
        MoneyHandler twoThousand = new TwoThousandHandler(2000);
        MoneyHandler fiveHundred = new FiveHundredHandler(500);
        MoneyHandler hundred = new HundredHandler(100);

        twoThousand.setNextDoor(fiveHundred);
        fiveHundred.setNextDoor(hundred);
        return twoThousand;
    }
}
