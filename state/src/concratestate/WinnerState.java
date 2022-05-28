package concratestate;

import context.GumballMachine;
import state.State;

public class WinnerState extends State {

    public WinnerState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertCoin() {
        printMessage("Please wait, we already giving you a gumball");
    }

    @Override
    public void ejectCoin() {
        printMessage("You already turned the crank");
    }

    @Override
    public boolean turnCrank() {
        printMessage("Turning more thank one time doesn't give you new gumball");
        return false;
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getGumballCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            gumballMachine.setSoldGumballCount(0);
            printMessage("You are winner!!!");
            if (gumballMachine.getGumballCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoCoinState());
            } else {
                printMessage("Ooo there are no any gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
