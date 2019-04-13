package chap03.dto;

/**
 * 对象别名问题2
 */
public class PassObject {
    static void f(Letter y) {
        y.c = 'Z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c;" + x.c);
        f(x);
        System.out.println("2: x.c;" + x.c);
    }
}

class Letter {
    char c;
}