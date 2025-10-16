package VendingMachineLLD.VendingMachineState.impl;

import VendingMachineLLD.VendingMachineState.VendingMachineState;
import VendingMachineLLD.context.VendingMachine;

public class IdleState extends VendingMachineState{
    @Override
    public void beginTransaction(VendingMachine vendingMachine) throws Exception {
        System.out.println("CurrentState: " + vendingMachine.getCurrentState().getClass().getSimpleName());
        System.out.println("A new Transaction has been started...");
        vendingMachine.setCurrentState(new SelectionState());
    }

}
