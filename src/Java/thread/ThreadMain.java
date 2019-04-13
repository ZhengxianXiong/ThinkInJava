package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.start();

        ThreadB threadB = new ThreadB();
        new Thread(threadB).start();

        ThreadC threadC = new ThreadC();
        FutureTask<String> future = new FutureTask<>(threadC);
        new Thread(future).start();

        try {
            System.out.println("返回结果：" + future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("这是主线程。");
    }
}
