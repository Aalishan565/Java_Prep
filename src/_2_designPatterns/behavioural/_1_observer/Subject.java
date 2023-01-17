package _2_designPatterns.behavioural._1_observer;

public interface Subject {

    void registerObserver(Observer observer);
    void unRegisterObserver(Observer observer);
    void notifyObserver(Message message);

}
