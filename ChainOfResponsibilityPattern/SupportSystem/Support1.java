package SupportSystem;

public class Support1 extends Support{
    
    public Support1(int level){
            this.level=level;
        }

    @Override
    public void process(String issue) {
        System.out.println("SUPPORT-1: resolving issue: "+issue);
    }
    
    
}
