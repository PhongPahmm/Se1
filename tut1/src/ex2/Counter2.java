package ex2;

public class Counter2 {
    int count;

    public Counter2() {
        count = 0;
    }
    public int get(){
        return this.count;
    }
    public void increment() {
        count *= 2;
    }

    public static void main(String[] args) {
        Counter2 counter = new Counter2();
        for (int i = 1; i <= 100; i++) {
            counter.increment();
            System.out.println("Iteration " + i + ": Count = " + counter.get());
        }
    }
}
