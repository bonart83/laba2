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

    public String toString(){
        return String.format("%s, Equipment: %s",super.getName(), super.getEquipments());
    }

    public int hashCode(){
        int hash = 53&super.hashCode() & getDuration();
        return  hash;
    }

    public boolean equals(Object obj){
        Aerobics otherAbstractExercise = (Aerobics) obj;
        return super.getName()==otherAbstractExercise.getName() && this.getEquipments() == otherAbstractExercise.getEquipments();
    }
}