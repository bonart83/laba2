package oop.model;

public class Aerobics extends AbstractExercise implements Exercise {
    private int duration;

    public Aerobics (String name, Equipments equipments, Approach[] approaches){
        super(name,equipments);
        WeightTraining weightTraining = new WeightTraining(name,approaches);
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}