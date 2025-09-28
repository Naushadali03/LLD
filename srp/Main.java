public class Main {
    public static void main(String[] args) {
        BreadBakers bakers = new BreadBakers();
        InventoryManager inventoryManager = new InventoryManager();
        CustomerService customerService = new CustomerService();
        BakerCleaners bakerCleaners = new BakerCleaners();
        SupplyOrder supplyOrder = new SupplyOrder();

         bakers.bakeBread();
         inventoryManager.inventoryManager();
         customerService.serveCustomer();
         bakerCleaners.bakerCleaner();
         supplyOrder.supplyOrder();
    } 
}
