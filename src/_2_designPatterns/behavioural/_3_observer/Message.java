package _2_designPatterns.behavioural._3_observer;

public class Message {

    private final String message;

    Message(String msg) {
        message = msg;
    }

    public String getMessage() {
        return message;
    }
}
