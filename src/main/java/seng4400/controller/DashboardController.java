package seng4400.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import seng4400.model.OutputMessages;

@Controller
public class DashboardController {
    private static final OutputMessages outputMessages = new OutputMessages();

    @GetMapping("")
    public String loadPage(Model model) {
        model.addAttribute("messages", outputMessages.getMessages());
        return "index";
    }

    public static OutputMessages getOutputMessages() {
        return outputMessages;
    }
}
