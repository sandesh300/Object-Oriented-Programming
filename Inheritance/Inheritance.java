package Inheritance;
// Java program for Inheritance.

class Animal {
    String name;

    public void eat() {
        System.out.println("I can eat.");
    }
}

class Sound extends Animal {
    public void voice() {
        System.out.println("I can bark.");
    }
}

class Dog extends Sound {
    public void printName() {
        System.out.println("My name is " + name);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Sheru";
        dog.printName();
        dog.voice();
        dog.eat();
    }
}

// o/p- My name is Sheru
// I can bark.
// I can eat.