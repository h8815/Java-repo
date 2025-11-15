// Parent class
class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

// Child class
class Dog extends Animal {
    Dog() {
        this("Doggy"); // Calls the parameterized constructor of Dog
    }
    Dog(String name) {
        super(); // Calls the constructor of Animal
        System.out.println("Dog constructor called: " + name);
    }
}

public class SuperThisConstructor {
    public static void main(String[] args) {
        Dog d1 = new Dog();         // Calls Dog(), which calls this("Doggy"), which calls super()
        Dog d2 = new Dog("Tommy");  // Calls Dog(String), which calls super()
    }
}
