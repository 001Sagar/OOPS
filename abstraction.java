abstract class Animal {

    // Constructor
    Animal() {
        System.out.println("You are creating a Animal");
    }
    
    // Abstract Method
    abstract void walk();

    // Non Abstract Method
    public void eat() {
        System.out.println("Eat Something");
    }
}

class Hourse extends Animal {
    public void walk() {
        System.out.println("Walk on 4 Legs");
    }

    // public void eat(){
    // System.out.println("Eat the Grass");
    // }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walk on 2 Legs");
    }

    public void eat() {
        System.out.println("Eat the omnivores");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Hourse h1 = new Hourse();
        Chicken c1 = new Chicken();

        h1.walk();
        h1.eat();
        c1.walk();
        c1.eat();
    }
}
