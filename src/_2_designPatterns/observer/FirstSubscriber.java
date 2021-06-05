package _2_designPatterns.observer;

public class FirstSubscriber implements Observer {
    @Override
    public void updateMessage(Message message) {
        System.out.println(message.getMessage());
    }
}
