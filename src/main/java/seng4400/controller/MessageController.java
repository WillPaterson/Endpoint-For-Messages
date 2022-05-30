package seng4400.controller;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.springframework.web.bind.annotation.*;
import seng4400.model.OutputMessage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Handles message post request and updating the message queue for dashboard
 */
@RestController
public class MessageController {

    /**
     * Handles Post request of a message
     * @param payload incoming message from post request
     */
    @PostMapping("/process")
    public void process(@RequestBody String payload) {
        try {
            // Get message from Json
            Gson gson = new Gson();
            OutputMessage outputMessage = gson.fromJson(payload, OutputMessage.class);

            // Update received time stamp
            setTimeStamp(outputMessage);

            System.out.println("DEBUG: " + outputMessage);

            // Add message to Dashboard message Queue
            DashboardController.addMessage(outputMessage);
        } catch (JsonSyntaxException e) {
            System.err.println("There was an error parsing this message:");
            System.err.println(payload);
        }
    }

    private void setTimeStamp(OutputMessage message) {
        // Format current time
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        // Set message receive time
        message.setTimeStamp(dateTimeFormatter.format(LocalDateTime.now()));
    }
}
