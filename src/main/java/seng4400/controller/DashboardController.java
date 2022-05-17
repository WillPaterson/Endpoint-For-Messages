package seng4400.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import seng4400.model.MessageQueue;
import seng4400.model.OutputMessage;

import java.util.Queue;

@Controller
public class DashboardController {
    private static final MessageQueue messageQueue = new MessageQueue();

    @GetMapping("")
    public String loadPage(Model model) {
        model.addAttribute("messages", getMessages());
        return "index";
    }

    public static void addMessage(OutputMessage message) {
        messageQueue.addMessage(message);
    }

    public static Queue<OutputMessage> getMessages() {
        return messageQueue.getMessages();
    }
}
