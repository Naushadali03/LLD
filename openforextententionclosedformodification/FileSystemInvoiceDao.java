package openforextententionclosedformodification;

public class FileSystemInvoiceDao implements InvoiceDao {

    @Override
    public void save(InvoiceDao invoiceDao) {
       System.out.println("Saving invoice object into the file system....");
    }
    
}
