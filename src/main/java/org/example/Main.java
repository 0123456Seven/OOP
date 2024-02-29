package org.example;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("HyperX", new Monitor("Xiaomi"));
        computer.on();
        computer.off();
    }
}