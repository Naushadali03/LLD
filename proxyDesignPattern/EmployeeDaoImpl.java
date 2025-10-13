public class EmployeeDaoImpl implements EmployeeDao{
    int id;
    String name;
    double salary;
    String department;
    UserRole userRole;
    public EmployeeDaoImpl(int id,String name,String department,double salary,UserRole userRole){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.userRole=userRole;
    }

    @Override
    public void getEmployeeInfo() {
       System.out.println("Employee Info:" + " Name: " + name + ", Department: " + department);
    }

    @Override
    public void createEmployee() {
        System.out.println("Employee " + name + " has been created in the system.");
    }

    @Override
    public void deleteEmployee() {
         System.out.println("Employee " + name + " has been deleted from the system.");
    }

    @Override
    public void updateSalary(double newSalary) {
         this.salary = newSalary;
        System.out.println("Salary updated to: Rs. " + newSalary);

    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println("Employee Details: " + "Id: " + id + ", Name: " + name + ", Department: " + department + ", Salary: Rs" + salary + ", Role: " + userRole);
    }
    
}
