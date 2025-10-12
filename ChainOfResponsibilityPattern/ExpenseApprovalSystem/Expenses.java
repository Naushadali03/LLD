package ExpenseApprovalSystem;

public abstract class Expenses {
    protected Expenses expenses;
    protected int level;
    public void setNextDoor(Expenses expenses){
        this.expenses=expenses;
    }
    public void processExpensed(int amount){
        boolean isProcess = process(amount);
        if(this.expenses!=null && !isProcess){
            this.expenses.processExpensed(amount);
        }
    }
    public abstract boolean process(int amount);
}
