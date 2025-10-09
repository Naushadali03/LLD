public class DebugLogProcess extends LogProcessor{

    public DebugLogProcess(int level){
        this.level=level;
    }

    @Override
    public void write(String message) {
       System.out.println("DEBUG:"+message);
    }
    
}
