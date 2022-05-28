import context.GumballMachine;

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
    }
}
