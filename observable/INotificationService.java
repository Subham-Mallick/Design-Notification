package org.example.designpattern.ObserverDesignPattern.example3.Design;

public interface INotificationService {

    void addObserver(org.example.designpattern.ObserverDesignPattern.example3.Design.Observer observer);
    void removeObserver(org.example.designpattern.ObserverDesignPattern.example3.Design.Observer observer);
    void notifyObserver();

}
