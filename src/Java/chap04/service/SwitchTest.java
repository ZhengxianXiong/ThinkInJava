package chap04.service;

public class SwitchTest {
    public static void main(String[] args) {
        String str = "u";
        SwitchTest.doSomeThing(str);
    }

    public static void doSomeThing(String str) {
        switch (str) {
            case "u":
                System.out.println("this is u");
                break;
            case "q":
                System.out.println("this is q");
                break;
            default:
                break;
        }
    }
}
