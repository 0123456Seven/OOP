package oop.checkpoint3;

public class Main {
    public static void main(String[] args) {
        Brain brain = new Brain(123);
        Programmer programmer = new Programmer(22, 182, 70, "Marsel", brain, "Programmer");
        System.out.println(programmer);
        programmer.work();
    }
}
