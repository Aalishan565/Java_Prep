package _2_designPatterns.observer;

import java.util.HashSet;
import java.util.Set;

public class MessagePublisher implements Subject {
    // Collection of observers
    private Set<Observer> observers = new HashSet<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyMessage(Message message) {
        for (Observer one : observers
        ) {
            one.updateMessage(message);
        }
    }
}
