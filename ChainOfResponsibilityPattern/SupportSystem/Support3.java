package SupportSystem;

public class Support3 extends Support{

    public Support3(int level){
        this.level=level;
    }

    @Override
    public void process(String issue) {
        System.out.println("SUPPORT-3: resolving issue: "+issue);
    }
    
}
