package openforextententionclosedformodification;

public class Main {
    public static void main(String[] args) {
        InvoiceDao dbinvoiceDao = new DatabaseInvoiceDao();
        InvoiceDao fileinvoiceDao = new FileSystemInvoiceDao();
        dbinvoiceDao.save(dbinvoiceDao);
        fileinvoiceDao.save(fileinvoiceDao);
    }
}
