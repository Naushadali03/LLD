package RequestValidationPipeline;


public class DataValidator extends Validator{

    public DataValidator(int level){
        this.level=level;
    }

    @Override
    public void process(String request) {
        System.out.println("DATA: "+request);
    }
    
}
