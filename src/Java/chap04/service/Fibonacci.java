package chap04.service;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci.doSomeThing(10);
    }

    public static void doSomeThing(int n) {
        boolean flag = true;
        int count = 0;//计数
        int a = 1;
        int b = 1;
        int c = 0;
        while (flag) {
            if (count < 2) {
                c = 1;
            } else {
                c = a + b;
            }
            System.out.println(c);
            a = b;
            b = c;
            count += 1;
            if (count >= n) flag = false;
        }
    }
}
