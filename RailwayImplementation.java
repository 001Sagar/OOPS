class Train {
    int trainNumber;
    String starting;
    String destination;

    // Default constructor
    Train() {
        System.out.println("Railway construactor had been called");
    }

    // Parameterized constructor for initialization
    Train(int trainNumber, String starting, String destination) {
        this.trainNumber = trainNumber;
        this.starting = starting;
        this.destination = destination;
    }

    // Setter methods
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setStarting(String starting) {
        this.starting = starting;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    // Getter methods
    public int getTrainNumber() {
        return this.trainNumber;
    }

    public String getStarting() {
        return this.starting;
    }

    public String getDestination() {
        return this.destination;
    }

    // Method Overloading: Additional info method
    public void info() {
        System.out.println(
                "Train Number: " + this.trainNumber + ", Starting: " + this.starting + ", Destination: "
                        + this.destination);
    }

    public void info(boolean includeWelcomeMessage) {
        if (includeWelcomeMessage) {
            System.out.println("Welcome aboard!");
        }
        info(); // Call the basic info method
    }

}

public class RailwayImplementation {
    public static void main(String[] args) {
        // Using parameterized constructor
        Train t1 = new Train(1, "Shamli", "Baruat");

        // Using default constructor and setters
        Train t2 = new Train();
        t2.trainNumber = 2;
        t2.starting = "Baruat";
        t2.destination = "Shamli";

        // Call the Method
        t1.info(true);
        t2.info();
    }
}
