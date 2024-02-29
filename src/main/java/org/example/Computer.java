package org.example;

public class Computer implements OnOff{
    private String name;
    private Monitor monitor;


    public Computer(){

    }
    public Computer(String name){
        this.name = name;
    }

    public Computer(String name, Monitor monitor) {
        this.name = name;
        this.monitor = monitor;
    }

    public void on(){
        System.out.println("Компьютер включился "+name+", используется монитор "+monitor.getName());
    }
    public void off(){
        System.out.println("Компьютер выключился "+name+", используется монитор "+monitor.getName());
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", monitor=" + monitor +
                '}';
    }
}
