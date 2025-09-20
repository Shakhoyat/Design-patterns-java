// FACTORY: Creates objects without specifying exact classes

// Product interface
interface Animal {
    void makeSound();
}

// Concrete products
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Factory
class AnimalFactory {
    public static Animal createAnimal(String type) {
        if (type.equals("dog"))
            return new Dog();
        if (type.equals("cat"))
            return new Cat();
        return null;
    }
}

// Usage
class FactoryDemo {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");
        Animal cat = AnimalFactory.createAnimal("cat");

        dog.makeSound(); // Woof!
        cat.makeSound(); // Meow!
    }
}