package ex2;

public class Counter {
    int count;
    public Counter() {
        count = 0;
    }

    public int get(){
        return this.count;
    }
    public void increment() {
        ++count;
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        for (int i = 1; i <= 100; i++) {
            c.increment();
            System.out.println("Iteration " + i + ": Count = " + c.get());
        }
    }
}

