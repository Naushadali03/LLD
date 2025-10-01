package strategyPattern.compressionUtility;

public class Tar implements CompressionStrategy{

    @Override
    public void compressionUtility() {
        System.out.println("Using Tar Compression...");
    }
    
}
