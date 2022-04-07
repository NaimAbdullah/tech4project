package oop_principles.class_objects;

public class Car {

    // Default constructor
    public Car(){

    }

    public String make;
    public String model;
    public String color;
    public int year;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
