package oop;


import oop.car.BMW;
import oop.car.Car;
import oop.motorbike.Kawasaki;
import oop.motorbike.Ural;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(10);
        Car car = new Car(10 , engine);
        System.out.println(car.getEngine());

//        car.setName("car");
//        car.drive(); // если метод drive переопределен в классе Car - то будет вызван именно он (иначе будет вызван родит. метод)


    }
}
