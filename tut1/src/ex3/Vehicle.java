package ex3;

public class Vehicle {
    String name;
    double width;
    double height;
    double length;
    double weight;
    int seatingCapacity;
    String registrationNumber;
    public Vehicle(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.seatingCapacity = seatingCapacity;
        this.registrationNumber = registrationNumber;

        if (!isValidName()){
            throw new IllegalArgumentException("Invalid vehicle name");
        }
        if (!isValidWidth()){
            throw new IllegalArgumentException("Invalid vehicle width");
        }
        if (!isValidHeight()){
            throw new IllegalArgumentException("Invalid vehicle height");
        }
        if (!isValidLength()){
            throw new IllegalArgumentException("Invalid vehicle length");
        }
        if (!isValidWeight()){
            throw new IllegalArgumentException("Invalid vehicle weight");
        }
        if (!isValidSeatingCapacity()){
            throw new IllegalArgumentException("Invalid vehicle seating capacity");
        }
        if (!isValidRegistrationNumber()){
            throw new IllegalArgumentException("Invalid vehicle registration number");
        }
    }
    public boolean isValidName(){
        return name != null && name.length()<100;
    }
    public boolean isValidWidth(){
        return width>0;
    }
    public boolean isValidHeight(){
        return height>0;
    }
    public boolean isValidLength(){
        return length>0;
    }
    public boolean isValidWeight(){
        return weight>0;
    }
    public boolean isValidSeatingCapacity(){
        return seatingCapacity>0;
    }
    public  boolean isValidRegistrationNumber(){
        return !registrationNumber.isEmpty() && registrationNumber.length()<12;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", weight=" + weight +
                ", seatingCapacity=" + seatingCapacity +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
