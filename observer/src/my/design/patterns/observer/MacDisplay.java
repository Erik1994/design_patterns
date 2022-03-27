package my.design.patterns.observer;

import my.design.patterns.iobservable.IObservable;
import my.design.patterns.iobserver.IDisplay;
import my.design.patterns.iobserver.IObserver;
import my.design.patterns.observable.Weather;

public class MacDisplay implements IObserver, IDisplay {
    private String temperature;
    private String humidity;
    private Weather weather;

    public MacDisplay(Weather weather) {
        this.weather = weather;
        weather.addObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weather.getTemperature();
        this.humidity = weather.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature MacDisplay: " + temperature + "\n" + "Humidity MacDisplay:" + humidity);
    }
}
