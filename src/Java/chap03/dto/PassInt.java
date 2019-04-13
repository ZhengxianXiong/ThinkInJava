package chap03.dto;

public class PassInt {
    static void doSomeThing(int y) {
        y = 10;
    }

    static void doSomeThing2(int x) {
        x = 10;
    }

    public static void main(String[] args) {
        Num n = new Num();
        n.i = 1;
        System.out.println("1: n.i;" + n.i);
        doSomeThing(n.i);
        System.out.println("2: n.i;" + n.i);
        n.in = 2;
        System.out.println("3: n.in;" + n.in);
        doSomeThing(n.i);
        System.out.println("4: n.in;" + n.in);
    }
}

class Num {
    int i;
    Integer in;
}