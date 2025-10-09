package SupportSystem;

public class Support2 extends Support{
    public Support2(int level){
        this.level=level;
    }

    @Override
    public void process(String issue) {
        System.out.println("SUPPORT-2: resolving issue: "+issue);
    }
}
