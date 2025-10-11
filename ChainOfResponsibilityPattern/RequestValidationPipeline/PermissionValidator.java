package RequestValidationPipeline;

public class PermissionValidator extends Validator{

    public PermissionValidator(int level){
        this.level=level;
    }

    @Override
    public void process(String request) {
       System.out.println("PERMISSION: "+request);
    }
    
}
