package DatabaseAccess;


public class RealDataBase implements DataBase{
    int id;
    String name;
    int age;
    UserRole userRole;
    public RealDataBase(int id,String name,int age,UserRole userRole){
        this.id=id;
        this.name=name;
        this.age=age;
        this.userRole=userRole;
    }
    @Override
    public void create() {
        System.out.println("The entry is registered for "+name+" with id "+id+" and "+age);
    }
    @Override
    public void update(String name) {
        this.name=name;
        System.out.println("The entry with name "+name+" is updated....");
    }
    @Override
    public void getData() {
       System.out.println("The details for the id "+id+" is as follow: name"+name+" age: "+age);
    }
}
