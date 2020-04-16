package oop.model;

public class Approach {
    private int duration;
    private double weight;
    private int attemptsQuantity;

    public Approach(){
        this.weight=0;
        this.duration=2;
        this.attemptsQuantity=12;
    }
    public Approach(int duration, double weight, int attemptsQuantity){
        this.duration = duration;
        this.weight = weight;
        this.attemptsQuantity = attemptsQuantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAttemptsQuantity() {
        return attemptsQuantity;
    }

    public void setAttemptsQuantity(int attemptsQuantity) {
        this.attemptsQuantity = attemptsQuantity;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


}
