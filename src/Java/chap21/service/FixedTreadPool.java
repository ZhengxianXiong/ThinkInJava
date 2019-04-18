package chap21.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedTreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        int n = 5;
        while (n-- > 0) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
