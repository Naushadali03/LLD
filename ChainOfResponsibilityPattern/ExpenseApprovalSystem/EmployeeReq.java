package ExpenseApprovalSystem;

public class EmployeeReq {
    public static void main(String[] args) {
        Expenses expenses = getChainOfExpenses();
        expenses.processExpensed(60000);
        
    }
    public static Expenses getChainOfExpenses(){
        Expenses directorExpenses = new Director(50000);
        Expenses managerExpenses = new Manager(50000);
        Expenses teamLeadExpenses = new TeamLead(10000);

        teamLeadExpenses.setNextDoor(managerExpenses);
        managerExpenses.setNextDoor(directorExpenses);
        return teamLeadExpenses;
    }
}
