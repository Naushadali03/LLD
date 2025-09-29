package openforextententionclosedformodification;

public class DatabaseInvoiceDao implements InvoiceDao {

    @Override
    public void save(InvoiceDao invoiceDao) {
        System.out.println("Saving invoice object into database....");
    }
    
}
