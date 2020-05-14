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

    public String toString(){
        return String.format("w: %s kg #: %s t: %s min",this.weight, this.attemptsQuantity, this.duration );
    }

    public int hashCode(){
        int hash = this.duration & Double.hashCode(weight);
        return  hash;
    }
    public boolean equals(Object obj){
        Approach otherApproach = (Approach) obj;
        return this.duration == otherApproach.duration && this.weight == otherApproach.weight && this.attemptsQuantity == otherApproach.attemptsQuantity ;
    }
}
