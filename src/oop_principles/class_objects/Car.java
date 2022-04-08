package oop_principles.class_objects;

public class Car {

    public Car(){ // default constructor

    }

    /*
    Attributes of a car
    make, model, year, color
    ATTRIBUTES ARE DEFINING WHAT EVERY
     */
//Declaring attributes or fields of Car
    public String make;
    public String model;
    public int year;
    public String color;

    //Defining some behaviors of the Car objects
    //What car does

    public void drives(){
        System.out.println("This car drives");
    }
    public void honks(){
        System.out.println("This car honks");
    }

//Override toString() method that comes from Object class
    //Overriding is implementing another body for the parent method
    @Override //override annotation is optional, can remove
    //right click-generate-toString- pick variables-hit ok
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
