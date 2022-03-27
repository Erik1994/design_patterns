package my.design.patterns.observable;

import my.design.patterns.iobservable.IObservable;
import my.design.patterns.iobserver.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Weather implements IObservable {
    private List<IObserver> observers = new ArrayList<>();
    private String temperature;

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
            observer.update(temperature);
        }
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
        notifyChanges();
    }
}
