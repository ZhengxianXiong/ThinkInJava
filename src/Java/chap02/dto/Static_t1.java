package chap02.dto;

public class Static_t1 {
    static int i = 0;

    public static void main(String[] args) {
        Static_t1 t1 = new Static_t1();
        Static_t1 t2 = new Static_t1();
        System.out.println(t1.i);
        System.out.println(t2.i);
        t1.i = 2;
        System.out.println(t1.i);
        System.out.println(t2.i);
    }
}
