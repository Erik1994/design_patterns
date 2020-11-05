package my.design.patterns.iobservable;

import my.design.patterns.iobserver.IObserver;

public interface IObservable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyChanges();
}
