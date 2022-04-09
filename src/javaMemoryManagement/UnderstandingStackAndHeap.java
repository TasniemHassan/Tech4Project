package javaMemoryManagement;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {

        int age = 45;
        System.out.println(age);

        //reference on left(stored in stack) - object on right(stored in heap)
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        System.out.println(dog1);// will get location bc we didnt call toString() method yet
                                // javaMemoryManagement.Dog@1540e19d
        System.out.println(dog2);//javaMemoryManagement.Dog@677327b6
        System.out.println(dog3); //javaMemoryManagement.Dog@14ae5a5
    }
}
