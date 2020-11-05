package my.design.patterns.iobserver;

public interface IObserver {
    void update(String temperature);
    void display(String temperature);
}
