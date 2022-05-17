package seng4400.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;
import seng4400.model.OutputMessage;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class MessageController {

    @PostMapping("/process")
    public void process(@RequestBody String payload) {
        Gson gson = new Gson();
        OutputMessage outputMessage = gson.fromJson(payload, OutputMessage.class);

        setTimeStamp(outputMessage);

        System.out.println("DEBUG: " + outputMessage);

        DashboardController.addMessage(outputMessage);
    }

    private void setTimeStamp(OutputMessage message) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        message.setTimeStamp(dateTimeFormatter.format(LocalDateTime.now()));
    }
}
