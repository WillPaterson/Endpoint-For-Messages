package seng4400.model;

import lombok.Getter;

import java.util.LinkedList;

/**
 * Represents a message sent from subscriber
 */
public class MessageQueue {
    @Getter
    LinkedList<OutputMessage> messages = new LinkedList<>();

    /**
     * Add a new message to queue. If limit of 50 reached removes the oldest message.
     * @param message to add to queue
     */
    public void addMessage(OutputMessage message) {
        messages.addFirst(message);
        if (messages.size() > 50) {
            removeOldMessage();
        }
    }

    /**
     * Remove last message from queue
     */
    public void removeOldMessage() {
        messages.removeLast();
    }
}
