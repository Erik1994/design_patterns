package my.design.patterns.observer;

import my.design.patterns.iobserver.IObserver;

public class MacDisplay implements IObserver {
    private String temperature;

    @Override
    public void update(String temperature) {
        this.temperature = temperature;
        display(temperature);
    }

    @Override
    public void display(String temperature) {
        System.out.println("Temperature MacDisplay: " + temperature);
    }
}
