package _2_designPatterns.behavioural._3_observer;

public interface Subject {
    void register(Observer observer);
    void unRegister(Observer observer);
    void notifyMessage(Message message);
}
