package _2_designPatterns.observer;

public interface Subject {
    void register(Observer observer);
    void unRegister(Observer observer);
    void notifyMessage(Message message);
}
