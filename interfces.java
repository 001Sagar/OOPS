interface Animal {
    void walk();
}

interface Herbivore {
    void eat();
}

class Hourse implements Animal, Herbivore {

    public void walk() {
        System.out.println("walk on 4 legs");
    }

    public void eat() {
        System.out.println("Eat the Grass");
    }
}

public class interfces {
    public static void main(String[] args) {
        Hourse h1 = new Hourse();
        h1.eat();
        h1.walk();
    }
}
