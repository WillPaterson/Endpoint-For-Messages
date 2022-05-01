package seng4400.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;
import seng4400.model.OutputMessages;
import seng4400.model.OutputMessage;

@RestController
public class MessageController {
    OutputMessages outputMessages = new OutputMessages();
    @PostMapping("/process")
    public void process(@RequestBody String payload) {
        Gson gson = new Gson();
        OutputMessage outputMessage = gson.fromJson(payload, OutputMessage.class);

        System.out.println(outputMessage);

        outputMessages.addMessages(outputMessage);
    }
    @GetMapping("/process")
    public String processGet() {
        return "Process Page";
    }
}
