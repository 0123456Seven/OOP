package oop;


public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        BMW bmw = new BMW();

        bmw.drive();
        System.out.println("car.getColor() = " + car.getColor());
        System.out.println("car.getModel() = " + car.getModel());
        System.out.println("car.getName() = " + car.getName());
        System.out.println("car.getNumber() = " + car.getNumber());
        
//        car.setName("car");
//        car.drive(); // если метод drive переопределен в классе Car - то будет вызван именно он (иначе будет вызван родит. метод)


    }
}
