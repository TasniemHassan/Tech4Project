package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleTest {
    public static void main(String[] args) {
        //Create 2 Apple Objects

        Apple apple1 = new Apple();
        apple1.color = "Red";
        apple1.taste = "Sweet";
        apple1.price = 0.99;
        //System.out.println(apple1); // prints location

        System.out.println("Apple{" + "color='" + apple1.color + "', " +
                "taste='" + apple1.taste + "', " +
                "price='" + apple1.price  + "'}");
        System.out.println(apple1.color);
        System.out.println(apple1.taste);
        System.out.println(apple1.price);

        Apple apple2 = new Apple();
        apple2.color="Green";
        apple2.taste = "Sour";
        apple2.price = 1.29;
        System.out.println("Apple{" + "color='" + apple2.color + "', " +
                "taste='" + apple2.taste + "', " +
                "price='" + apple2.price  + "'}");
        System.out.println(apple1.toString());
        System.out.println(apple1.color);
        System.out.println(apple1.taste);
        System.out.println(apple1.price);
       // System.out.println(apple2); // prints location, location diff than apple1
        System.out.println(apple2.color);
        System.out.println(apple2.taste); // if nothing defined so takes default
        System.out.println(apple2.price);

        //apple2.taste = "Sour";// to get sour to print, needs to be before printing

        Apple apple3 = new Apple();
        apple3.color = "Yellow";
        apple3.price = .95;
        apple3.taste = "Sweet";
        System.out.println(apple3);

        Apple[] myApples = {apple1, apple2, apple3}; //apple array
        System.out.println(Arrays.toString(myApples)); //print array

        ArrayList<Apple> myAppleList = new ArrayList<>(Arrays.asList(myApples)); //convert array to list
        System.out.println(myAppleList); //print list

        for (Apple apple: myAppleList) {
            System.out.println("My Apple = " + apple);
        }

        for (Apple apple: myAppleList){
            System.out.println(apple.color);
            System.out.println(apple.taste);
            System.out.println(apple.price);
        }
    }

}
