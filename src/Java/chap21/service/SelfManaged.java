package chap21.service;

public class SelfManaged implements Runnable {
    private int countDown = 5;
    private Thread t = new Thread(this);

    public SelfManaged() {
        t.start();
    }

    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        int num = 5;
        while (num-- > 0) {
            new SelfManaged();
        }
    }
}
