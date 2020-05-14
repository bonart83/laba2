package oop.model;

import org.w3c.dom.ls.LSOutput;

public class Workout {
    Exercise[] exercises;
    int size;
    int count;

    public Workout() {
        this.size = 16;
        this.exercises = new Exercise[size];
        this.count=0;
    }

    public Workout(Exercise[] exercises) {
        this.size = exercises.length;
        this.exercises = exercises;
        this.count=size;
    }

    public Workout(int size) {
        this.size = size;
        this.exercises = new Exercise[size];
        this.count=0;
    }

    public boolean add (Exercise exercise) {
        for (int i = 0; i < size; i++) {
            if (exercises[i] == null) {
                exercises[i] = exercise;
                count++;
                return true;
            }
        }
        return false;
    }
    public boolean add (Exercise exercise, int index) {
        if (index<size && exercises[index]==null) {
            exercises[index]=exercise;
            count++;
            return true;
        }
        else return false;
    }
    public Exercise get(int index){
        return exercises[index];
    }
    public Exercise set(int index,Exercise exercise){
        exercises[index]=exercise;
        return exercises[index];
    }
    public Exercise remove(int index){
        if (index<size && exercises[index]!=null) {
            Exercise exercise = exercises[index];
            count--;
            for (int i = index+1; i <size; i++) {
                exercises[i-1] = exercises[i];
            }
            exercises[size-1]=null;
            return exercise;
        }
        else{
            return null;
        }
    }
    public int remove(String exerciseName){
        int counter=0;
        for (int i = 0; i <size; i++) {
            if (exercises[i]!=null&&exercises[i].getName().equals(exerciseName)){
                remove(i);
                counter++;
                count--;
            }
        }
        return counter;
    }
    public int size(){
        return size;
    }
    public Exercise[] getExercises(){
        return exercises;
    }
    public Exercise[] getExercisesWhithEquipment(){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (exercises[i].getEquipments().equals(Equipments.NONE)){
                count++;
            }
        }
        Exercise[] exercisesWhithEquipment = new Exercise[count];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (exercises[i].getEquipments().equals(Equipments.NONE)){
                exercisesWhithEquipment[j] = exercises[i];
                j++;
            }
        }
        return exercisesWhithEquipment;
    }
    public boolean hasExercises(String exerciseName){
        for (int i = 0; i <size; i++) {
            if (exercises[i]!=null&&exercises[i].getName().equals(exerciseName)){
                return true;
            }
        }
        return false;
    }
    public int durationTotal(){
        int counter=0;
        for (int i = 0; i <size; i++) {
            if (exercises[i]!=null)
            counter+=exercises[i].getDuration();
        }
        return counter;
    }
    public void increaseArray(){
        Exercise[] newExercises= new Exercise[this.size*2];
        for (int i = 0; i <size; i++) {
            newExercises[i]=exercises[i];
        }
        size *=2;
        exercises = newExercises;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("Workout:\n");
        Exercise[] returnWorkout = getExercises();
        for (int i = 0; i < returnWorkout.length; i++) {
            if (returnWorkout[i]!=null){sb.append(returnWorkout[i].toString()+"\n");}
        }
        return sb.toString();
    }

    public  int indexOf(Exercise exercise){
        Exercise[] returnWorkout = getExercises();
        for (int i = 0; i < returnWorkout.length; i++) {
            if (returnWorkout[i].equals(exercise)){
                return i;
            }
        }
        return -1;
    }
    public  int LastIndexOf(Exercise exercise){
        Exercise[] returnWorkout = getExercises();
        for (int i = returnWorkout.length-1; i >= 0 ; i--) {
            if (returnWorkout[i].equals(exercise)){
                return i;
            }
        }
        return -1;
    }
    public boolean remove(Exercise exercise){
        int index = indexOf(exercise);
        return  remove(index)!=null;
    }
}