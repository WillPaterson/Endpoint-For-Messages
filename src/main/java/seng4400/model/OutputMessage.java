package seng4400.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

/**
 * Represents a message sent from subscriber
 */
@Getter
@Setter
@ToString
public class OutputMessage {
    private int[] answer;
    private int[] answerShort;
    private double time_taken;
    private String timeStamp;
}
