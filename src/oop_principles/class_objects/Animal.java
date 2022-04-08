package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    //we know there is a default constructor, lets reveal it

    public Animal(){

    }
// create a custom constructor that takes 6 args- name, color, age, ifHerbivore, isCarnivore, isOmnivore
     public Animal(String name, String color, int age, boolean isCarnivore, boolean isHerbivore,  boolean isOmnivore){
   //I should assign these local variables into instance variables
    this.name = name;
    this.color=color;
    this.age=age;
    this.isHerbivore = isHerbivore;
    this.isOmnivore = isOmnivore;
    this.isCarnivore = isCarnivore;
     }
     public Animal(String name, String color){
        this.name = name;
        this.color = color;
     }
    //Fields of an Animal instance
    public static final boolean hasEyes = true; //static makes it more so all animals have eyes in the class Animal
    public String name;
    public int age;
    public String color;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;
//static means it belongs to all objects in the class  and can be accessed freely

   /* @Override // can modify based on what we want to print
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isCarnivore=" + isCarnivore +
                ", isHerbivore=" + isHerbivore +
                ", isOmnivore=" + isOmnivore +
                '}';
    }

    */
   @Override //this will only print non null or 0 values
   public String toString() {
       String s = "Animal{";
       if(this.name != null) s +=   "name='" + this.name + '\'';
       if(this.color != null) s += ", color='" + this.color + '\'';
       if(this.age != 0) s +=  ", age=" + this.age;
       if(this.isCarnivore) s += ", isCarnivore=" + this.isCarnivore;
       if(this.isHerbivore) s += ", isHerbivore=" + this.isHerbivore;
       if(this.isOmnivore) s += ", isOmnivore=" + this.isOmnivore;
       s += '}';
       return s;
   }



    /*public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.hasEyes = false; //reassigned
        System.out.println(animal1.hasEyes); // false;
    }

     */

   /* public static void main(String[] args) {
        Animal animal1 = new Animal();
        //animal1.hasEyes = false; //reassigned but compiler error as hasEyes is a final instance variable
        System.out.println(animal1.hasEyes); // true;
    }

    */

    /*public static void main(String[] args) {
        System.out.println(Animal.hasEyes); // true
    }

     */

    public static void main(String[] args) {
        /*
        Create an animal object called a1 and define its information as belos
         */

        Animal animal1 = new Animal();

         animal1.name = "Cow";
         animal1.age = 3;
         animal1.color = "Black";
         animal1.isCarnivore = false;
         animal1.isHerbivore = true;
         animal1.isOmnivore = false;

        System.out.println(animal1);

        Animal a1 = new Animal("Cow", "Black", 3, false, true, false);
        System.out.println(a1);

        Animal a2 = new Animal("Cat", "Gray", 1, false, false, true);
        System.out.println(a2);


        Animal a3 = new Animal ("Parrot", "White", 1, false, true, false);

        /*
Create a4 object with below info
Lion
4
Beige
Carnivore

Print it as well
 */
        Animal a4 = new Animal("Lion", "Beige", 4, true, false, false);

        System.out.println(a3);
        System.out.println(a4);



        List<Animal> animals = new ArrayList<>();

        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);

        int countH = 0;
        int countO = 0;
        int countC = 0;

        for(Animal animal : animals){
            if(animal.isHerbivore) countH++;
            else if(animal.isOmnivore) countO++;
            else countC++;
        }
        System.out.println("Herbivore = " + countH);
        System.out.println("Omnivore = " + countO);
        System.out.println("Carnivore = " + countC);

        //another way
        int herbivoreCount = (int) animals.stream().filter(animal -> animal.isHerbivore).count();
        int carnivoreCount = (int) animals.stream().filter(animal -> animal.isCarnivore).count();
        int omnivoreCount = (int) animals.stream().filter(animal -> animal.isOmnivore).count();

        /* another way
        List<Animal> animals = new ArrayList<>(Arrays.asList(a1,a2,a3,a4));
int countHerb = 0;
int countCarni = 0;
int countOmni = 0;
for (Animal animal : animals) {
    if(animal.isOmnivore) countOmni++;
    else if(animal.isHerbivore) countHerb++;
    else countCarni++;
}
System.out.print("Herbivore = " + countHerb + " Carnivore = " + countCarni + " Omnivore = " + countOmni);
         */
    }



}
