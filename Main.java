public class Main {
    public static void main(String[] args) {
        countTime();
        fizzBuzz(30);
    }

    public static void countTime() {
        TimeCounter tc = new TimeCounter();
        TimeDisplayer td = new TimeDisplayer(tc);
        FiveSecDisplayer fsd = new FiveSecDisplayer(tc);
        Thread t1 = new Thread(td);
        Thread t2 = new Thread(fsd);

        t1.start();
        t2.start();
        try {
            Thread.sleep(10500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.interrupt();
        t1.interrupt();
    }

    public static void fizzBuzz(int n)
    {
        FizzBuzzClass fbc = new FizzBuzzClass(n);
        Thread t1 = new Thread(() -> fbc.fizz());
        Thread t2 = new Thread(() -> fbc.buzz());
        Thread t3 = new Thread(() -> fbc.fizzbuzz());
        Thread t4 = new Thread(() -> fbc.number());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
