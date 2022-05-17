package seng4400.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;
import seng4400.model.OutputMessages;
import seng4400.model.OutputMessage;

@RestController
public class MessageController {

    @PostMapping("/process")
    public void process(@RequestBody String payload) {
        Gson gson = new Gson();
        OutputMessage outputMessage = gson.fromJson(payload, OutputMessage.class);

        System.out.println(outputMessage);

        // TODO maybe add some sort of time stamp to output message?

        

        DashboardController.getOutputMessages().addMessages(outputMessage);
    }
}
