package seng4400.model;

import java.util.Arrays;

public class OutputMessage {
    private int[] answer;
    private double time_taken;

    private long timeStamp;

    public int[] getAnswer() {
        return answer;
    }

    public double getTime_taken() {
        return time_taken;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setAnswer(int[] answer) {
        this.answer = answer;
    }

    public void setTime_taken(double time_taken) {
        this.time_taken = time_taken;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "OutputMessage {" +
                "answer=" + Arrays.toString(answer) +
                ", time_taken=" + time_taken +
                '}';
    }
}
