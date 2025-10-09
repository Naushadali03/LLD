package SupportSystem;

public class ClientSupport {
    public static void main(String[] args) {
        Support support = getSupport();
        System.out.println("====providing support=====");
        support.resolveIssue(Support.LEVEL1, "front end crashed.....");
        support.resolveIssue(Support.LEVEL2, "Backend crashed.......");
        support.resolveIssue(Support.LEVEL3, "Server crashed........");
    }
    public static Support getSupport(){
        Support support3 = new Support3(Support.LEVEL3);
        Support support2 = new Support2(Support.LEVEL2);
        Support support1 = new Support1(Support.LEVEL1);

        support1.setNextDoor(support2);
        support2.setNextDoor(support3);

        return support1;
    }
}
