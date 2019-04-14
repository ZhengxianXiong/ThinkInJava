package chap06.service;

public class MethodTest {

    public static void main(String[] args) {
        MethodTest.print("");
        MethodTest.print(1);
        MethodTest.print(1f);
    }

    public static void print(Object obj) {
        System.out.println(obj);
    }
}
