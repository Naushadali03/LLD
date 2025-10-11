package RequestValidationPipeline;

public class AuthValidator extends Validator{

    public AuthValidator(int level){
        this.level=level;
    }

    @Override
    public void process(String request) {
        System.out.println("AUTH: "+request);
    }
    
}
