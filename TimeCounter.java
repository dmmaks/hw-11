public class TimeCounter {
    private int time;

    public TimeCounter() {
        time = 0;
    }

    public synchronized void increment()
    {
        time++;
        System.out.println("Time passed: " + time);
        notify();
    }

    public synchronized void displayFiveSecMessage()
    {
        while (time % 5 != 0 || time == 0)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("Five seconds passed");
    }
}




