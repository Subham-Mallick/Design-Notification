package org.example.designpattern.ObserverDesignPattern.example3.Design;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ProductNotificationService implements org.example.designpattern.ObserverDesignPattern.example3.Design.INotificationService {

    private final List<org.example.designpattern.ObserverDesignPattern.example3.Design.Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(org.example.designpattern.ObserverDesignPattern.example3.Design.Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(org.example.designpattern.ObserverDesignPattern.example3.Design.Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        List<CompletableFuture<Void>> futureList = new ArrayList<>();
        observerList.forEach(observer -> {
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                observer.notify(LocalDateTime.now().toString());
            });
            futureList.add(future);
        });

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(futureList.toArray(CompletableFuture[]::new));

        allFutures.join();
    }


}
