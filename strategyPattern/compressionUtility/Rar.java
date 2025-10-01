package strategyPattern.compressionUtility;

public class Rar implements CompressionStrategy{

    @Override
    public void compressionUtility() {
        System.out.println("Using Rar compression....");
    }
    
}
