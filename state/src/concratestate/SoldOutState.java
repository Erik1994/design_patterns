package concratestate;

import context.GumballMachine;
import state.State;

public class SoldOutState extends State {

    public SoldOutState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertCoin() {
        printMessage("Sorry, you cannot input coin");
    }

    @Override
    public void ejectCoin() {
        printMessage("There are no coin to eject");
    }

    @Override
    public boolean turnCrank() {
        printMessage("You cannot turn the crank now");
        return false;
    }

    @Override
    public void dispense() {
        printMessage("There are nothing to dispense");
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }
}
