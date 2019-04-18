package chap21.service;

public class BasicThreads {
    public static void main(String[] args) {
//        Thread t = new Thread(new LiftOff());
//        t.start();
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
    }
}
