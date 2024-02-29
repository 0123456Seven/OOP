package oop.checkpoint3;

public class Human {
    private int age;
    private int height;
    private int weight;
    private String name;
    private Brain brain;

    public Human(int age, int height, int weight, String name, Brain brain) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.brain = brain;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", brain=" + brain +
                '}';
    }
}
