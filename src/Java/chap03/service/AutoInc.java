package chap03.service;

public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i:" + i);
        System.out.println("++i:" + ++i);
        System.out.println("i++:" + i++);
        System.out.println("i:" + i);
        System.out.println("--i:" + --i);
        System.out.println("i--:" + i--);
        System.out.println("i:" + i);
        /**
         i:1
         ++i:2
         i++:2
         i:3
         --i:2
         i--:2
         i:1
         */
    }
}
