package org.example.designpattern.ObserverDesignPattern.example3.Design;

public class ProductionNotification {

    public static void main(String[] args) {
        org.example.designpattern.ObserverDesignPattern.example3.Design.INotificationService notificationService = new org.example.designpattern.ObserverDesignPattern.example3.Design.ProductNotificationService();
        org.example.designpattern.ObserverDesignPattern.example3.Design.User user1 = new org.example.designpattern.ObserverDesignPattern.example3.Design.User("user1");
        org.example.designpattern.ObserverDesignPattern.example3.Design.User user2 = new org.example.designpattern.ObserverDesignPattern.example3.Design.User("user2");
        org.example.designpattern.ObserverDesignPattern.example3.Design.User user3 = new org.example.designpattern.ObserverDesignPattern.example3.Design.User("user3");

        notificationService.addObserver(user1);
        notificationService.addObserver(user2);
        notificationService.addObserver(user3);

        notificationService.notifyObserver();

    }

}
