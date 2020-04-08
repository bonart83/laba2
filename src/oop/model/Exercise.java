package oop.model;

public class Exercise {
    private String name;
    private int duration;

    public Exercise(String name) {
        this.name = name;
        this.duration = 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}