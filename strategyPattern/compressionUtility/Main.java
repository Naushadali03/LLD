package strategyPattern.compressionUtility;

public class Main {
    public static void main(String[] args) {
        Compression zip = new Compression(new Zip());
        Compression tar = new Compression(new Tar());
        Compression rar = new Compression(new Rar());
        zip.compressionUtility();
        tar.compressionUtility();
        rar.compressionUtility();
    }
}
