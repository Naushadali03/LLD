package DatabaseAccess;

public class DataBaseProxy implements DataBase{
    public RealDataBase realDataBase;
    public DataBaseProxy(int id,String name,int age,UserRole userRole){
        realDataBase = new RealDataBase(id, name, age, userRole);
    }

    @Override
    public void create() {
        if(hasRole(AccessType.CREATE,this.realDataBase.userRole)){
            this.realDataBase.create();
        }
        else{
            throw new RuntimeException("Access Denied...");
        }
    }

    @Override
    public void update(String obj) {
       if(hasRole(AccessType.UPDATE,this.realDataBase.userRole)){
            this.realDataBase.update(obj);
       }
       else{
            throw new RuntimeException("Access Denied..");
       }
    }

    @Override
    public void getData() {
        if(hasRole(AccessType.VIEW_ALL_DETAILS, this.realDataBase.userRole)){
            this.realDataBase.getData();
        }
        else{
            throw new RuntimeException("Access Denied");
        }
    }

    private boolean hasRole(AccessType accessType,UserRole role){
       return switch(accessType){
            case AccessType.CREATE, AccessType.UPDATE -> role == UserRole.ADMIN;
            case AccessType.VIEW_ALL_DETAILS -> role==UserRole.USER;
            default -> false;
        };
    }
    
}
