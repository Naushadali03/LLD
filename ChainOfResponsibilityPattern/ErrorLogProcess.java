public class ErrorLogProcess extends LogProcessor{

    public ErrorLogProcess(int level){
        this.level=level;
    }

    @Override
    public void write(String message) {
        System.out.println("ERROR: "+message);
    }
    
}
