// Interface for Multiple & Hybrid Inheritance
interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}
class Animal_Father{
    void fatherProperty(){
        System.out.println("fatherProperty");
    }
}

// Base Class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Multiple & Hybrid Inheritance using Interfaces
class Child extends Animal implements Father, Mother {

    public void fatherProperty() {
        System.out.println("Father's Property");
    }

    public void motherProperty() {
        System.out.println("Mother's Property");
    }

    void ownProperty() {
        System.out.println("Child's Own Property");
    }
}

class om implements Father,  Mother {
    public void fatherProperty() {
        System.out.println("Father's Property");
    }

    public void motherProperty() {
        System.out.println("Mother's Property");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        System.out.println("=== Single Inheritance ===");
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println("\n=== Multilevel Inheritance ===");
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        System.out.println("\n=== Hybrid Inheritance ===");
        Child child = new Child();
        child.eat();
        child.fatherProperty();
        child.motherProperty();
        child.ownProperty();

        System.out.println("\n=== multiple Inheritance ===");
        om o = new om();
        o.fatherProperty();
        o.motherProperty();
    }
}