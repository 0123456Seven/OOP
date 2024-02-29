package oop.car;

public class BMW extends Car {
    public BMW(String name, String model, String color, int number) {
        super(name, model, color, number);
    }

    public BMW(){

    }
    @Override
    public void drive(){
        System.out.println("bmw is drive!");
    }

}
