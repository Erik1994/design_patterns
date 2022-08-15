package concratestate;

import context.GumballMachine;
import state.State;

public class HasCoinState extends State {
    private static int WINNER_NUMBER = 21;

    public HasCoinState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertCoin() {
        printMessage("You can't insert another coin");
    }

    @Override
    public void ejectCoin() {
        printMessage("Coin returned!");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    @Override
    public boolean turnCrank() {
        printMessage("Crank turned...");
        gumballMachine.setSoldGumballCount(gumballMachine.getSoldGumballCount() + 1);
        if (gumballMachine.getSoldGumballCount() == WINNER_NUMBER) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
        return true;
    }

    @Override
    public void dispense() {
        printMessage("No gumball to dispense");
    }
}
