package oop.model;

public abstract class AbstractExercise implements Exercise {
    private String name;
    private Equipments equipments;

    public AbstractExercise(){
        name = "";
        equipments = Equipments.NONE;
    }

    public  AbstractExercise(String name, Equipments equipments){
        this.name = name;
        this.equipments = equipments;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Equipments getEquipments(){return equipments;}
    public void setEquipments(Equipments equipments){this.equipments = equipments;}
    public String toString(){
        return String.format("%s, Equipment: %s",this.name, this.equipments);
    }
    public int hashCode(){
        int hash = this.name.hashCode() & this.equipments.hashCode();
        return  hash;
    }
    public boolean equals(Object obj){
        AbstractExercise otherAbstractExercise = (AbstractExercise) obj;
        return this.name==otherAbstractExercise.name && this.equipments == otherAbstractExercise.equipments;
    }

}
