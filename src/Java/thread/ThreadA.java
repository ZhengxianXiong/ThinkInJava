package thread;

public class ThreadA extends Thread {
    public void run() {
        super.run();
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这是线程A");
    }
}
