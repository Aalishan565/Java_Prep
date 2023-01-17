package _2_designPatterns.behavioural._1_observer;

public class ObserverTestRunner {

    public static void main(String[] args) {
        FirstSubscriber firstMessageSubscriber = new FirstSubscriber();
        SecondSubscriber secondMessageSubscriber = new SecondSubscriber();
        ThirdSubscriber thirdMessageSubscriber = new ThirdSubscriber();
        //Creating Message Publisher
        MessagePublisher messagePublisher = new MessagePublisher();
        //Register two Subscribers to get notifications on any update
        messagePublisher.registerObserver(firstMessageSubscriber);
        messagePublisher.registerObserver(secondMessageSubscriber);
        messagePublisher.registerObserver(thirdMessageSubscriber);
        //firstMessageSubscriber and secondMessageSubscriber will receive the update
        messagePublisher.notifyObserver(new Message("This is First Message"));
        System.out.println("---------------------------------------------------------------");
    }

}
