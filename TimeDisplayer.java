public class TimeDisplayer implements Runnable {
    private TimeCounter tc;

    public TimeDisplayer(TimeCounter tc) {
        this.tc = tc;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                tc.increment();
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}