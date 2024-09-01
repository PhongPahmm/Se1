package ex3;

public class IronSuit extends Vehicle{
    int powerLevel;
    public IronSuit(String name, double width, double height, double length,
                    double weight, int seatingCapacity, String registrationNumber, int powerLevel) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        this.powerLevel = powerLevel;
    }
    public void fly(String startPoint, String endPoint, int distance) {
        System.out.println("Flying from " + startPoint + " to " + endPoint + "...");
        System.out.print(startPoint + " ");

        // Simulating the flight progress with a progress bar
        for (int i = 0; i < distance; i++) {
            try {
                Thread.sleep(300); // Pause for 0.3 seconds between each dot
            } catch (InterruptedException e) {
                // Ignore exception
            }
            System.out.print("."); // Print dot to simulate progress
        }

        System.out.println(" " + endPoint);
        System.out.println("Arrived at " + endPoint + ". Distance covered: " + distance + " units.");
    }
}
