package ExpenseApprovalSystem;

public class Director extends Expenses{
    public Director(int level){
        this.level=level;
    }

    @Override
    public boolean process(int amount) {
        if(amount>level){
            System.out.println("DIRECTOR: Reibursment initiated..."+amount);
            return true;
        }
        return false;
    }
    
}
