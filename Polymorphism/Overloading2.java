package Polymorphism;

// Java program for Method Overloading
// by Using Different Numbers of Arguments

class Test {

    static int Multiply(int a, int b) {

        return a * b;
    }

    static int Multiply(int a, int b, int c) {

        return a * b * c;
    }
}

public class Overloading2 {
    public static void main(String[] args) {
        System.out.println(Test.Multiply(2, 4));  //8
        System.out.println(Test.Multiply(2, 7, 3));  //42
    }
}
