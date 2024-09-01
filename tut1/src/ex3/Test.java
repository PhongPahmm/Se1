package ex3;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Automobile", 10.0, 10.0, 10.0,
                10.0, 10, "12345ABCD");

        int[] busRoutes = {101, 102, 103, 104};
        Bus bus = new Bus("City Bus", 2.8, 3.5, 8.5, 8000.0,
                40, "BUS1234", busRoutes);

        Car car = new Car("Sports Car", 2.0, 1.5, 3.0, 1500.0, 4,
                "CAR123", "John Doe");
        System.out.println(vehicle);
        System.out.println(bus);
        System.out.println(car);

        IronSuit ironSuit = new IronSuit("Automobile", 10.0, 10.0, 10.0,
                10.0, 10, "12345ABCD", 100);
        ironSuit.fly("Hanoi", "Da Nang", 25);
    }
}
