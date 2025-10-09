package SupportSystem;

public abstract class Support {
    public final static int LEVEL1 = 1;
    public final static int LEVEL2 = 2;
    public final static int LEVEL3 = 3;
    Support support;
    int level;
    public void setNextDoor(Support support){
        this.support=support;
    }
    public void resolveIssue(int level,String issue){
        if(this.level==level){
            process(issue);
        }
        if(this.support!=null){
            this.support.resolveIssue(level, issue);
        }
    }
    public abstract void process(String issue);
}
