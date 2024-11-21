class Pen {
    String color;
    String type; // gelpen , ballpen

    public void write() {
        System.out.println("writing something");
    }

    public void printDetails() {
        System.out.println("The Color of Pen " + this.color);
        System.out.println("The Type of Pen " + this.type);
    }
}

public class oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        pen1.color = "blue";
        pen1.type = "ball";

        pen2.color = "black";
        pen2.type = "gel";

        pen1.write();
        pen1.printDetails();
        pen2.printDetails();

    }
}
