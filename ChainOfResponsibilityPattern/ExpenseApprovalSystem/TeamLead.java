package ExpenseApprovalSystem;

public class TeamLead extends Expenses{
    public TeamLead(int level){
        this.level=level;
    }

    @Override
    public boolean process(int amount) {
        if(amount<=level){
            System.out.println("TEAMLEAD: Reibursment initiated.... "+amount);
            return true;
        }
        return false;
    }
    
}
