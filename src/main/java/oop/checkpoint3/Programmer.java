package oop.checkpoint3;

public class Programmer extends Worker{

    public Programmer(int age, int height, int weight, String name, Brain brain, String job) {
        super(age, height, weight, name, brain, job);
    }
    public void prog(){
        System.out.println("Coding...");
    }

}
