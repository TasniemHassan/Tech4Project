package accessModifiers.package1;

public class Honda {

    {
        //local block
    }

    static{

    }
    public Honda(){

    }
    //instance variables
    public static final String make = "Honda";
    public String color;
    protected String model; // access in same package unless there is inheritance
    int year; // same package access not diff package
    private double price;
// private only accessed in same class

    public void drive(){

    }

    void brake(){

    }

    protected void honk(){

    }

    private void stop(){

    }
    public static void main(String[] args) {
        Honda h1 = new Honda(); // objects in the same class as the instance modifiers can all be accessed


    }
}
