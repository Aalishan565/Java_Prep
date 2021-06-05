package _2_designPatterns.observer;

public class ObserverTest {
    public static void main(String[] args) {
        FirstSubscriber firstMessageSubscriber = new FirstSubscriber();
        SecondSubscriber secondMessageSubscriber = new SecondSubscriber();
        ThirdSubscriber thirdMessageSubscriber = new ThirdSubscriber();
        //Creating Message Publisher
        MessagePublisher messagePublisher = new MessagePublisher();
        //Register two Subscribers to get notifications on any update
        messagePublisher.register(firstMessageSubscriber);
        messagePublisher.register(secondMessageSubscriber);
        messagePublisher.register(thirdMessageSubscriber);
        //firstMessageSubscriber and secondMessageSubscriber will receive the update
        messagePublisher.notifyMessage(new Message("This is First Message"));
        System.out.println("---------------------------------------------------------------");


    }
}
