package seng4400.model;

import java.util.Queue;

public class OutputMessages {
    Queue<OutputMessage> messages;

    public void addMessages(OutputMessage message) {
        messages.add(message);
    }

    public Queue<OutputMessage> getMessages() {
        return messages;
    }
}
