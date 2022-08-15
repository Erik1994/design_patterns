package context;

import concratestate.*;
import state.State;

public class GumballMachine {
    private final State hasCoinState;
    private final State noCoinState;
    private final State soldOutState;
    private final State soldState;
    private final State winnerState;

    private State state;
    private int gumballCount;
    private int soldGumballCount;

    public GumballMachine(int gumballCount) {
        hasCoinState = new HasCoinState(this);
        noCoinState = new NoCoinState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.gumballCount = gumballCount;
        if (this.gumballCount > 0) {
            state = noCoinState;
        } else {
            state = soldOutState;
        }
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void turnCrank() {
        if (state.turnCrank()) {
            dispense();
        }
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    private void dispense() {
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public int getSoldGumballCount() {
        return soldGumballCount;
    }

    public void setSoldGumballCount(int soldGumballCount) {
        this.soldGumballCount = soldGumballCount;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (gumballCount > 0) {
            --gumballCount;
        }
    }

    public void refill(int count) {
        this.gumballCount += count;
        System.out.println("The machine is refilled. the count is: " + this.gumballCount);
        state.refill();
    }
}
