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

public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();

        // Call methods from the parent and child classes
        myCar.start();  // Inherited from Vehicle class
        myCar.honk();   // Defined in Car class
        myCar.stop();   // Inherited from Vehicle class

        // Create a Bicycle object
        Bicycle myBicycle = new Bicycle();

        // Call methods from the parent and child classes
        myBicycle.start();    // Inherited from Vehicle class
        myBicycle.ringBell(); // Defined in Bicycle class
        myBicycle.stop();     // Inherited from Vehicle class
    }
}
