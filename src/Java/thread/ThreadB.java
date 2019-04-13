package thread;

public class ThreadB implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这是线程B");
    }
}
