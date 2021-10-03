package my.design.patterns.secondimpl.operation;

import my.design.patterns.secondimpl.Strategy;

public class Substraction implements Strategy {
    @Override
    public int execute(int num1, int num2) {
        return num1 - num2;
    }
}
