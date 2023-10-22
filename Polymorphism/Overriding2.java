package Polymorphism;
// java program for method overriding

    class Animal {
        public void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }
    
    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Bark! Bark!");
        }
    }
    
    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow! Meow!");
        }
    }
    
    public class Overriding2 {
        public static void main(String[] args) {
            Animal animal1 = new Dog();
            Animal animal2 = new Cat();
    
            animal1.makeSound();  // Bark! Bark!
            animal2.makeSound();  // Meow! Meow!
        }
    }
