package my.design.patterns.observable;

import my.design.patterns.iobservable.IObservable;
import my.design.patterns.iobserver.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Weather implements IObservable {
    private List<IObserver> observers = new ArrayList<>();
    private String temperature;
    private String humidity;

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyChanges() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    public void setMeasurements(String temperature, String humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyChanges();
    }

    public String getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }
}
