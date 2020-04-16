package oop.model;

public class Aerobics implements Exercise {
    private String name;
    private int duration;

    public Aerobics(String name) {
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