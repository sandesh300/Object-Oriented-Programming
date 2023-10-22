package Polymorphism;
// Java program for Method Overloading


public class Overloading1 {
    public void m1() {
        System.out.println("no-arg");
    }

    public void m1(int i) {
        System.out.println("int-arg");
    }

    public void m1(double d) {
        System.out.println("double-arg");
    }

    public static void main(String[] args) {
        Overloading1 ol = new Overloading1();
        ol.m1();  //no-arg
        ol.m1(10);  // int-arg
        ol.m1(10.5);  //double-arg 
    }
}
