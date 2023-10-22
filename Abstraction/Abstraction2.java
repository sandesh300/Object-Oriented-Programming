package Abstraction;
// Java program for Abstraction
//WAP to return number of wheels of bus and car using abstract class.

abstract class Wheels {
    abstract public int getNoOfWheels();
}

class Bus extends Wheels {
    public int getNoOfWheels() {
        return 6;
    }
}

class Car extends Wheels {
    public int getNoOfWheels() {
        return 4;
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        System.out.println("The no of wheels of bus = " + bus.getNoOfWheels());

        Car car = new Car();
        System.out.println("The no of wheels of car = " + car.getNoOfWheels());
    }
}


// The no of wheels of bus = 6
// The no of wheels of car = 4