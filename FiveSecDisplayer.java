public class FiveSecDisplayer implements Runnable {
    private TimeCounter tc;

    public FiveSecDisplayer(TimeCounter tc) {
        this.tc = tc;
    }

    @Override
    public void run() {
        while (true) {
            try {
                tc.displayFiveSecMessage();
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}