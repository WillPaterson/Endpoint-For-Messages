package seng4400.model;

import java.util.Arrays;

public class OutputMessage {
    private int[] answer;
    private double time_taken;

    public int[] getAnswer() {
        return answer;
    }

    public double getTime_taken() {
        return time_taken;
    }

    public void setAnswer(int[] answer) {
        this.answer = answer;
    }

    public void setTime_taken(double time_taken) {
        this.time_taken = time_taken;
    }

    @Override
    public String toString() {
        return "OutputMessage {" +
                "answer=" + Arrays.toString(answer) +
                ", time_taken=" + time_taken +
                '}';
    }
}
