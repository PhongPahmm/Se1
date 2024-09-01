package ex3;

public class Bus extends Vehicle {
    int[] routes;


    public Bus(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber, int[] routes) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        this.routes = routes;
    }

    @Override
    public boolean isValidWeight() {
        return weight >= 5000.0 && weight <= 20000.0;
    }

    @Override
    public boolean isValidLength() {
        return length >= 4.0 && length <= 10.0;
    }

    @Override
    public boolean isValidRegistrationNumber() {
        return !registrationNumber.isEmpty() && registrationNumber.length() <=8;
    }

    public int[] getRoutes() {
        return routes;
    }

    public void setRoutes(int[] routes) {
        this.routes = routes;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
