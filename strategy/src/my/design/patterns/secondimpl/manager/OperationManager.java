package my.design.patterns.secondimpl.manager;

import my.design.patterns.secondimpl.Strategy;

public class OperationManager {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2) {
        return strategy.execute(num1, num2);
    }
}
