import javax.management.RuntimeErrorException;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDaoImpl realEmployeeDaoImpl;
    public EmployeeDaoProxy(int id,String name,String department,double salary,UserRole userRole){
        realEmployeeDaoImpl = new EmployeeDaoImpl(id, name, department, salary, userRole);
    }

    @Override
    public void getEmployeeInfo() {
       if(hasAccessForRole(AccessType.VIEW_BASIC_INFO, this.realEmployeeDaoImpl.userRole)){
        this.realEmployeeDaoImpl.getEmployeeInfo();
       }
       else{
        throw new RuntimeException("Access Denied");
       }
    }

    @Override
    public void createEmployee() {
        if(hasAccessForRole(AccessType.CREATE, this.realEmployeeDaoImpl.userRole)){
            this.realEmployeeDaoImpl.createEmployee();
        }
        else{
            throw new RuntimeException("Access Denied");
        }
    }

    @Override
    public void deleteEmployee() {
       if(hasAccessForRole(AccessType.DELETE, this.realEmployeeDaoImpl.userRole)){
            this.realEmployeeDaoImpl.deleteEmployee();
       }
       else{
            throw new RuntimeException("Access Denied");
       }
    }

    @Override
    public void updateSalary(double newSalary) {
        if(hasAccessForRole(AccessType.UPDATE, this.realEmployeeDaoImpl.userRole)){
            this.realEmployeeDaoImpl.updateSalary(newSalary);
        }
        else{
            throw new RuntimeException("Access Denied");
        }
    }

    @Override
    public void displayEmployeeDetails() {
        if(hasAccessForRole(AccessType.VIEW_ALL_DETAILS, this.realEmployeeDaoImpl.userRole)){
            this.realEmployeeDaoImpl.displayEmployeeDetails();
        }
        else {
            throw new RuntimeException("Access denied");
        }
    }

     private boolean hasAccessForRole(AccessType acesssType, UserRole role) {
        return switch (acesssType) {
            case AccessType.CREATE, AccessType.DELETE -> role == UserRole.ADMIN;
            case AccessType.UPDATE -> role == UserRole.ADMIN || role == UserRole.HR;
            case AccessType.VIEW_ALL_DETAILS -> role == UserRole.MANAGER || role == UserRole.HR || role == UserRole.ADMIN;
            case AccessType.VIEW_BASIC_INFO -> role == UserRole.EMPLOYEE || role == UserRole.MANAGER || role == UserRole.HR || role == UserRole.ADMIN;
            default -> false;
        };
    }

    
}
