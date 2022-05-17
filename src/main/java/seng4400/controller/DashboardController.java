package seng4400.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import seng4400.model.MessageQueue;
import seng4400.model.OutputMessage;

@Controller
public class DashboardController {
    private static final MessageQueue MESSAGE_QUEUE = new MessageQueue();

    @GetMapping("")
    public String loadPage(Model model) {
        model.addAttribute("messages", MESSAGE_QUEUE.getMessages());
        return "index";
    }

    public static void addMessage(OutputMessage message) {
        MESSAGE_QUEUE.addMessage(message);
    }
}
