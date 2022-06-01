package seng4400.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
     * @return String to load index.html
     */
    @GetMapping("")
    public String loadDashboard() {
        return "index";
    }

    /**
     * Returns message queue
     * @param model Store attributes for html page
     * @return String to load message table fragment
     */
    @PostMapping(value="/update_table")
    public String sendHtmlFragment(Model model) {
        model.addAttribute("messages", getMessages());
        return "messageTable :: messages_fragment";
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
