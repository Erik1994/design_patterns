package concratestate;

import context.GumballMachine;
import state.State;

public class NoCoinState extends State {

    public NoCoinState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertCoin() {
        printMessage("You inserted coin");
        gumballMachine.setState(gumballMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        printMessage("You haven't inserted coin to eject");
    }

    @Override
    public boolean turnCrank() {
        printMessage("You turned without coin");
        return false;
    }

    @Override
    public void dispense() {
        printMessage("You need to pay first!");
    }
}
