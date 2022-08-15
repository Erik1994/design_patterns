package state;

import context.GumballMachine;

public abstract class State {
    protected GumballMachine gumballMachine;

    public State(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public abstract void insertCoin();

    public abstract void ejectCoin();

    public abstract boolean turnCrank();

    public abstract void dispense();

    public void refill() {
        printMessage("No need to refill");
    }

    protected void printMessage(String message) {
        System.out.println(message);
    }
}
