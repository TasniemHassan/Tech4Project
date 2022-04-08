package oop_principles.class_objects;

public class Fruit {


    //Instance variables
    public static boolean hasColor;
    public String name;
    public String shape;
    public boolean isSweet;
    static{
        System.out.println("This is static block");
        hasColor = true;
    }

    {
        System.out.println("This is instance block");
        shape = "Round";
        isSweet = true;
    }

    public static void main(String[] args) {

        //static block of Fruit will be executed first
        System.out.println("This is line 1 in the main method before object being created");
        Fruit fruit1 = new Fruit();
        System.out.println("This is last line in the main method after being created");
    }




}
