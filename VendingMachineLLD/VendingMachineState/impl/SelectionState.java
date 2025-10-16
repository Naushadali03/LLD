package VendingMachineLLD.VendingMachineState.impl;

import java.util.Optional;

import VendingMachineLLD.VendingMachineState.VendingMachineState;
import VendingMachineLLD.context.Product;
import VendingMachineLLD.context.VendingMachine;

public class SelectionState extends VendingMachineState{
    
    @Override
    public void chooseProduct(VendingMachine vendingMachine, String productCode) throws Exception {
        System.out.println("CurrentState: " + vendingMachine.getCurrentState().getClass().getSimpleName());
        System.out.println("Product Selection in progress...");
        System.out.println("Product selected: " + productCode);
        Optional<Product> selectedProduct = vendingMachine.getInventory()
                .stream()
                .filter(product -> product.getProductCode().equals(productCode)).findFirst();
        if (selectedProduct.isEmpty()) {  
            vendingMachine.setCurrentState(new IdleState());
            throw new Exception("WRONG PRODUCT CODE: The product code is invalid. Please enter the correct code.");
        }
        if (selectedProduct.get().getQuantity() == 0) { 
            vendingMachine.setCurrentState(new IdleState());
            throw new Exception("OUT OF STOCK: The product is out of stock. Please select another product.");
        }
        vendingMachine.setSelectedProduct(selectedProduct.get());
        vendingMachine.setCurrentState(new CollectionMoney());
    }

}
