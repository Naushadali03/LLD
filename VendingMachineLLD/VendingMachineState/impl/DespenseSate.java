package VendingMachineLLD.VendingMachineState.impl;

import VendingMachineLLD.VendingMachineState.VendingMachineState;
import VendingMachineLLD.context.VendingMachine;

public class DespenseSate extends VendingMachineState{
     @Override
    public void dispenseProduct(VendingMachine vendingMachine) throws Exception {
        System.out.println("Current State: " + vendingMachine.getCurrentState().getClass().getSimpleName());
        System.out.print("Product Dispensed: ");
        System.out.println(vendingMachine.getSelectedProduct().getName());
        System.out.println("Change Dispensed: " + vendingMachine.getChangeToReturn());
        vendingMachine.getInventory().stream()
                .filter(product -> product.getProductCode().equals(vendingMachine.getSelectedProduct().getProductCode()))
                .findFirst()
                .ifPresent(product -> product.setQuantity(product.getQuantity() - 1));
        vendingMachine.setCurrentState(new IdleState());
    }

}
