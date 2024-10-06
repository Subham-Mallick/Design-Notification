package org.example.designpattern.ObserverDesignPattern.example3.Design;

public class User implements org.example.designpattern.ObserverDesignPattern.example3.Design.Observer {

    private final String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void notify(String message) {
        System.out.println("Called from username :"+username+". Time : "+message);
    }
}
