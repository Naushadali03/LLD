package VendingMachineLLD.VendingMachineState.impl;

import VendingMachineLLD.VendingMachineState.VendingMachineState;
import VendingMachineLLD.context.VendingMachine;

public class CollectionMoney extends VendingMachineState{
    @Override
    public void insertCoin(VendingMachine vendingMachine, Double amountPaid) throws Exception {
        System.out.println("Current State: " + vendingMachine.getCurrentState().getClass().getSimpleName());
        System.out.println("You Paid: " + amountPaid);
        if (amountPaid < vendingMachine.getSelectedProduct().getPrice()) {
            vendingMachine.initiateRefund(amountPaid);
            vendingMachine.setCurrentState(new IdleState());
            throw new Exception("INSUFFICIENT AMOUNT: Amount paid is less than the product price. Amount Refunded.");
        }
        vendingMachine.setPaymentMade(amountPaid);
        vendingMachine.setCurrentState(new DespenseSate());
    }

}
