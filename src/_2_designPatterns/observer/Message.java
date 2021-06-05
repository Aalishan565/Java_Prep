package _2_designPatterns.observer;

public class Message {
    private final String message;

    Message(String msg) {
        message = msg;
    }

    public String getMessage() {
        return message;
    }
}
