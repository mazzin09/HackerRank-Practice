package OOP;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class TestOverride {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        animal.makeSound(); // outputs "The animal makes a sound"

        Dog dog = new Dog();
        dog.makeSound(); // outputs "The dog barks"
    }
}