package oop.checkpoint3;

public class Worker extends Human{
    private String job;
    public void work(){
        System.out.println("I'm "+job);
    }

    public Worker(int age, int height, int weight, String name, Brain brain, String job) {
        super(age, height, weight, name, brain);
        this.job = job;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "job='" + job + '\'' +
                '}';
    }
}
