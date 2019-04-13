package thread;

import java.util.concurrent.Callable;

public class ThreadC implements Callable<String> {
    public String call() {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这是线程C");
        return "thread C";
    }
}
