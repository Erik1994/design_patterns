package my.design.patterns.observer;

import my.design.patterns.iobservable.IObservable;
import my.design.patterns.iobserver.IDisplay;
import my.design.patterns.iobserver.IObserver;
import my.design.patterns.observable.Weather;

public class TabletDisplay implements IObserver, IDisplay {
    private String temperature;
    private Weather weather;

    public TabletDisplay(Weather weather) {
        this.weather = weather;
        weather.addObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weather.getTemperature();
        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature TabletDisplay: " + temperature);
    }
}
