package Polymorphism;

// Java program for method overriding.

class Parent {

    public void chocolate() {
        System.out.println("Dark Chocolate");
    }
}

class Child extends Parent {
    @Override
    public void chocolate() {
        System.out.println("Milk Chocolate");
    }
}

public class Overriding1 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.chocolate();  // Dark Chocolate

        Child child = new Child();
        child.chocolate();  //Milk Chocolate

        Parent parent1 = new Child();
        parent1.chocolate();  //Milk Chocolate
    }
}
