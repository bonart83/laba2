package oop.model;

public interface ComplexExercise extends Exercise {
    public boolean add(Approach approach);
    public Approach remove();
    public Approach approach();
    public boolean add(int index, Approach approach);
    public Approach get(int index);
    public Approach[] getApproaches();
    public Approach remove(int index);
    public void set(int index, Approach approach);
    public int size();
    public double[] approachWeights();
    public int[] approachAttemptQuantities();
    public Approach remove(Approach approach);
    public int indexOf(Approach approach);
    public int lastIndexOf(Approach approach);
}
