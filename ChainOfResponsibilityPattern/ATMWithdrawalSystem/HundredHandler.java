package ATMWithdrawalSystem;

public class HundredHandler extends MoneyHandler {
    public HundredHandler(int level) {
        this.level = level;
    }

    @Override
    public int process(int amount) {
        int count = amount / this.level;
        int remainder = amount % this.level;
        if (count > 0) {
            System.out.println("Dispensing " + count + " notes of ₹" + this.level);
        }
        return remainder;
    }

}
