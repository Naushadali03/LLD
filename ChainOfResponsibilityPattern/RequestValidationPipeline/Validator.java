package RequestValidationPipeline;

public abstract class Validator {
    public final static int AUTH=1;
    public final static int DATA=2;
    public final static int PERMISSION=3;
    Validator validator;
    int level;
    public void setNextDoor(Validator validator){
        this.validator=validator;
    }
    public void processRequest(int level,String request){
        if(this.level==level){
            process(request);
        }
        if(this.validator!=null){
            this.validator.processRequest(level, request);
        }
    }
    public abstract void process(String request);
}
