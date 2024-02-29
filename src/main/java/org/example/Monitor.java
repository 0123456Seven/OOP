package org.example;

public class Monitor implements OnOff{
    private String name;
    @Override
    public void on() {
        System.out.println("Монитор "+name+" включился");
    }

    @Override
    public void off() {
        System.out.println("Монитор "+name+" выключился");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor(String name) {
        this.name = name;
    }
}
