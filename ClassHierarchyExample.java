// Parent class (superclass)
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }

    void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

// Child class (subclass) inheriting from Vehicle
class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking.");
    }
}

// Another child class (subclass) inheriting from Vehicle
class Bicycle extends Vehicle {
    void ringBell() {
        System.out.println("Bicycle is ringing the bell.");
    }
}

public class ClassHierarchyExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.honk();
        myCar.stop();

        Bicycle myBicycle = new Bicycle();
        myBicycle.start();
        myBicycle.ringBell();
        myBicycle.stop();
    }
}
