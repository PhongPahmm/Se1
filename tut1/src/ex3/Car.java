package ex3;

public class Car extends Vehicle {
    String owner;

    public Car(String name, double width, double height, double length,
               double weight, int seatingCapacity, String registrationNumber, String owner) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        this.owner = owner;
    }

    @Override
    public boolean isValidWeight() {
        return weight >= 1000.0 && weight <= 2000.0;
    }

    @Override
    public boolean isValidLength() {
        return length >= 1.5 && length <= 3.5;
    }
    @Override
    public boolean isValidRegistrationNumber() {
        return !registrationNumber.isEmpty() && registrationNumber.length() <=6;
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
