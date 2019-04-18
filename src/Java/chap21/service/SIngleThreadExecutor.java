package chap21.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SIngleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        int n = 5;
        while (n-- > 0) {
            exec.execute(new LiftOff());
        }
    }
}
