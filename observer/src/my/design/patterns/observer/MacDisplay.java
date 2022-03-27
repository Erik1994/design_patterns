package my.design.patterns.observer;

import my.design.patterns.iobserver.IDisplay;
import my.design.patterns.iobserver.IObserver;

public class MacDisplay implements IObserver, IDisplay {
    private String temperature;

    @Override
    public void update(String temperature) {
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature MacDisplay: " + temperature);
    }
}
