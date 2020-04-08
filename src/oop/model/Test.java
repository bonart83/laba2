package oop.model;

public class Test {
    public static void main(String[] args) {
        lab1test();
    }
    static void lab1test(){
        Exercise exercise1 = new Exercise("Присед");
        Exercise exercise2 = new Exercise("Становая");
        Exercise exercise3 = new Exercise("Жим");
        Exercise exercise4 = new Exercise("Подтягивания");
        Exercise exercise5 = new Exercise("Отжимания");
        Workout workout = new Workout(4);
        System.out.println(workout.add(exercise1));
        System.out.println(workout.add(exercise2));
        System.out.println(workout.add(exercise3));
        System.out.println(workout.add(exercise4));
        while (!workout.add(exercise5)){
            workout.increaseArray();
        }
        System.out.println(workout.remove(3));
        System.out.println(workout.remove("Присед"));
        System.out.println(workout.durationTotal());
    }
}