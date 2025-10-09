public class FatalLogProcess extends LogProcessor{

    public FatalLogProcess(int level){
        this.level=level;
    }

    @Override
    public void write(String message) {
       System.out.println("FATAL: "+message);
    }

}
