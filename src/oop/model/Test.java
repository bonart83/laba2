package oop.model;

public class Test {
    public static void main(String[] args) {
        //lab1test();
        //lab2test();
        lab3test();
    }

    static void lab3test(){
        Approach approach = new Approach();
        Approach approach1 = new Approach(1 ,1, 1 );
        Approach approach2 = new Approach(2 ,2, 2 );
        Approach approach10 = new Approach(10 ,10, 10 );
        Approach[] approaches = new Approach[4];
        approaches[0] = approach;
        approaches[1] = approach1;
        approaches[2] = approach2;
        approaches[3] = approach10;
        Workout workout = new Workout(5);
        Exercise exercise1 = new Aerobics("Присед",Equipments.NONE,approaches);
        Exercise exercise2 = new Aerobics("Становая",Equipments.BURBELL,approaches);
        Exercise exercise3 = new Aerobics("Жим",Equipments.BURBELL,approaches);
        Exercise exercise4 = new Aerobics("Подтягивания",Equipments.NONE,approaches);
        Exercise exercise5 = new Aerobics("Отжимания",Equipments.NONE,approaches);
        workout.add(exercise1);
        workout.add(exercise2);
        workout.add(exercise3);
        workout.add(exercise4);
        workout.add(exercise5);
        Exercise[] exercise = workout.getExercisesWhithEquipment();
        for (int i = 0; i < exercise.length; i++) {
            System.out.println(exercise[i].getName());
        }
    }

    /*static void lab2test(){
        Approach approach = new Approach();
        Approach approach1 = new Approach(1 ,1, 1 );
        Approach approach2 = new Approach(2 ,2, 2 );
        Approach approach10 = new Approach(10 ,10, 10 );
        WeightTraining weightTraining = new WeightTraining("Штанга");
        weightTraining.add(approach);
        weightTraining.add(approach1);
        weightTraining.add(approach2);
        weightTraining.add(1,approach10);
        weightTraining.remove(1);
        System.out.println(weightTraining.getDuration());

        System.out.println(weightTraining.get(0).getWeight());
        weightTraining.remove();
        System.out.println(weightTraining.get(0).getWeight());
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
    */
}