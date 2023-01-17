package _2_designPatterns.behavioural._1_observer;

public class SecondSubscriber implements Observer {

    @Override
    public void onMessageReceive(Message message) {
        System.out.println(message.getMessage());
    }

}
