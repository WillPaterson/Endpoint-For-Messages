package seng4400.model;

import java.util.LinkedList;
import java.util.Queue;

public class OutputMessages {
    LinkedList<OutputMessage> messages = new LinkedList<>();
    public void addMessages(OutputMessage message) {
        messages.addFirst(message);
        //TODO limit to 50
    }

    public void removeOldMessage() {
        messages.removeLast();
    }

    public Queue<OutputMessage> getMessages() {
        return messages;
    }
}
