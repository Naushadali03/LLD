package strategyPattern.compressionUtility;

public class Compression {
    private final CompressionStrategy compressionStrategy;
    public Compression(CompressionStrategy compressionStrategy){
        this.compressionStrategy=compressionStrategy;
    }
    public void compressionUtility(){
        compressionStrategy.compressionUtility();
    }
}
