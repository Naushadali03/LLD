package DatabaseAccess;

public class DBManagement {
    public static void main(String[] args) {
        DataBaseProxy dataBaseProxy = new DataBaseProxy(1, "Ali", 23, UserRole.ADMIN);
        dataBaseProxy.create();
        dataBaseProxy.update("Saleh");
        dataBaseProxy = new DataBaseProxy(2, "Ali", 23, UserRole.USER);
        dataBaseProxy.getData();
    }
}
