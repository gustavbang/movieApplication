public class Timer {
    public static void delayFunction () {
        try {
            Thread.sleep(750);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}