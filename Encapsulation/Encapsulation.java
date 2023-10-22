//Encapsulation is achieved by declaring the variables as private and providing public setter and getter methods to modify and view the variable values.
// In encapsulation, the fields of a class are made read-only or write-only. This method also improves reusability.
// Java program for Encapsulation.
package Encapsulation;

class Animal {
    private int age; // private field

    public int getAge() // getter method
    {
        return age;
    }

    public void setAge(int age) // setter method
    {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setAge(12);

        System.out.println("animal age is =" + animal.getAge());  // animal age is =12
    }
}
