package seng4400.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/**
 * Represents a message sent from subscriber
 */
public class OutputMessage {
    @Getter
    @Setter
    private int[] answer;
    @Getter
    @Setter
    private double time_taken;
    @Getter
    @Setter
    private String timeStamp;

    @Override
    public String toString() {
        return "OutputMessage{" +
                "answer=" + Arrays.toString(answer) +
                ", time_taken=" + time_taken +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
