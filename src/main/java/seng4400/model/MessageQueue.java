package seng4400.model;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueue {
    LinkedList<OutputMessage> messages = new LinkedList<>();
    public void addMessage(OutputMessage message) {
        messages.addFirst(message);
        if (messages.size() > 50) {
            removeOldMessage();
        }
    }

    public void removeOldMessage() {
        messages.removeLast();
    }

    public Queue<OutputMessage> getMessages() {
        return messages;
    }
}
