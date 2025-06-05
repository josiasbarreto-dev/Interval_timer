package io.github.josiasbarreto_dev.Intervaltimer.model;

import java.time.LocalTime;

public class Time {
    private LocalTime currentTime;
    private LocalTime endTime;

    public Time(LocalTime currentTime, LocalTime endTime) {
        this.currentTime = currentTime;
        this.endTime = endTime;
    }

    public LocalTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Time{" +
                "currentTime=" + currentTime +
                ", endTime=" + endTime +
                '}';
    }
}
