package oop.model;

import javax.xml.soap.Node;
import java.lang.reflect.Array;
import java.util.Arrays;


public class WeightTraining extends AbstractExercise implements ComplexExercise {

    private class Node {
        public Node next;
        Approach value;

        public Node(Approach approach){
            this.value = approach;
        }
    }

    private String name;
    private int size;
    private Node head;
    private Node tail;

    public WeightTraining(String name){
        head = null;
        tail = null;
    }

    public WeightTraining(String name, Approach[] approaches){
        for (Approach approache : approaches) {
            add(approache);
            size++;
        }
    }

    public WeightTraining(String name, Equipments equipments){
        super(name,equipments);
    }

    private void addNode(Node node){
        if(head == null){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
    }

    private void addNode(int index,Node node){
        Node n = head;
        Node temp;
        int count = 0;
        while (n!=null){
            if (count+1==index){
                temp=n.next;
                n.next = node;
                node.next=temp;
                size++;
                return;
            }
            count++;
            n=n.next;
        }
    }

    private Node removeNode(int index){
        Node n = head;
        int count = 0;
        Node res;
        if (index==0){
            head=n.next;
            size--;
            return n;
        }
        while (n!=null){
            if (count+1==index){
                res=n.next;
                n.next = n.next.next;
                res.next=null;
                size--;
                return res;
            }
            count++;
            n=n.next;
        }
        return null;
    }

    private Node getNode(int index){
        Node n = head;
        int count = 0;
        while (n!=null){
            if (count==index){
                return n;
            }
            count++;
            n=n.next;
        }
        return null;
    }
    private void setNode(int index, Node node){
        Node n = head;
        int count = 0;
        Node temp;
        while (n!=null){
            if (count+1==index){
                temp = n.next.next;
                n.next=node;
                node.next = temp;
            }
            count++;
            n=n.next;
        }
    }



    @Override
    public int getDuration() {
        int sum = 0;
        Approach[] approaches = getApproaches();
        for (int i = 0; i < approaches.length; i++) {
            sum+=approaches[i].getDuration();
        }
        return sum;
    }

    @Override
    public void setDuration(int duration) { }

    @Override
    public boolean add(Approach approach) {
        addNode(new Node(approach));
        return true;
    }

    @Override
    public Approach remove() {
        return removeNode(0).value;
    }

    @Override
    public Approach approach() {
        return head.value;
    }

    @Override
    public boolean add(int index, Approach approach) {
        addNode(index,new Node(approach));
        return true;
    }

    @Override
    public Approach get(int index) {
        return getNode(index).value;
    }

    @Override
    public Approach[] getApproaches() {
        Approach[] returnArr=new Approach[size];
        Node n = head;
        int i = 0;
        while (n!=null){
            returnArr[i] = n.value;
            i++;
            n=n.next;
        }
        return returnArr;
    }

    @Override
    public Approach remove(int index) {
        return removeNode(index).value;
    }

    @Override
    public void set(int index, Approach approach) {
        setNode(index,new Node(approach));
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public double[] approachWeights() {
        Approach[] approaches = getApproaches();
        double[] approachWeights = new double[approaches.length];
        for (int i = 0; i < approaches.length; i++) {
            approachWeights[i]=approaches[i].getWeight();
        }
        return approachWeights;
    }

    @Override
    public int[] approachAttemptQuantities() {
        Approach[] approaches = getApproaches();
        int[] approachAttemptQuantities = new int[approaches.length];
        for (int i = 0; i < approaches.length; i++) {
            approachAttemptQuantities[i]=approaches[i].getAttemptsQuantity();
        }
        return approachAttemptQuantities;
    }
}
