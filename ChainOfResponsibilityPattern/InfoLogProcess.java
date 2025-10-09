public class InfoLogProcess extends LogProcessor{
    public InfoLogProcess(int level){
        this.level=level;
    }

    @Override
    public void write(String message) {
        System.out.println("INFO: "+message);
    }
    
}
