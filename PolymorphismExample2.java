// Base class (superclass)
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Derived class (subclass)
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Derived class (subclass)
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class PolymorphismExample2 {
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal();  // Using the base class directly

        // Call the makeSound method on each animal
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
