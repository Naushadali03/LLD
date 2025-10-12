package ExpenseApprovalSystem;

public class Manager extends Expenses{
    public Manager(int level){
        this.level=level;
    }

    @Override
    public boolean process(int amount) {
       if(amount<=level){
            System.out.println("MANAGER: Reibursment initiated..."+amount);
            return true;
       }
       return false;
    }
    
}
