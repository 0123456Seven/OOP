package oop.motorbike;

import oop.Transport;

public class Motorbike extends Transport {
    private double volume;
    public Motorbike(){

    }

    public Motorbike(String name, String model, String color, double volume) {
        super(name, model, color);
        this.volume = volume;
    }
}
