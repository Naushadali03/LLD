package strategyPattern.compressionUtility;

public class Zip implements CompressionStrategy{

    @Override
    public void compressionUtility() {
        System.out.println("Using zip compression....");
    }
    
}
