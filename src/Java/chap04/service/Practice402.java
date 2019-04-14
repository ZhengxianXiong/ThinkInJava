package chap04.service;

/**
 * 打印素数，只能被1和自身整除
 */
public class Practice402 {
    public static void main(String[] args) {
        int num = 1;
        while (num < 1000) {
            if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
                System.out.println(num);
            }
            num++;
            if (num == 101) continue;
        }
    }
}
