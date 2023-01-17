package _2_designPatterns.behavioural._1_observer;

import java.util.HashSet;
import java.util.Set;

public class MessagePublisher implements Subject {

    // Collection of observers
    private Set<Observer> observers = new HashSet<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Message message) {
        for (Observer one : observers
        ) {
            one.onMessageReceive(message);
        }
    }

}
