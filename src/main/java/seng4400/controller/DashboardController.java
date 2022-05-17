package seng4400.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import seng4400.model.MessageQueue;
import seng4400.model.OutputMessage;

import java.util.Queue;

/**
 * Handles serving index html and tracking message queue
 */
@Controller
public class DashboardController {
    /**
     * Create a new Queue of output messages
     */
    private static final MessageQueue messageQueue = new MessageQueue();

    /**
     * Loads dashboard page
     * @param model Store attributes for html page
     * @return String to load index.html
     */
    @GetMapping("")
    public String loadDashboard(Model model) {
        // Add message queue to be passed to HTML
        model.addAttribute("messages", getMessages());
        return "index";
    }

    /**
     * Add a new message to queue
     * @param message to add to queue
     */
    public static void addMessage(OutputMessage message) {
        messageQueue.addMessage(message);
    }

    /**
     * Returns a Queue of output messages
     * @return full message queue
     */
    public static Queue<OutputMessage> getMessages() {
        return messageQueue.getMessages();
    }
}
