package chap02.dto;

public class q {
    public static void main(String[] args) {
        double q = 0.9999999999999;
        double rs = Math.pow(q, 10) - 10 * q + 9;
        System.out.println(rs);
        while (!(rs == 0)) {
            if (q == 1) {
                continue;
            }
            q = q - 0.0000001;
            rs = Math.pow(q, 10) - 10 * q + 9;
            System.out.println("q:" + q + "   rs:" + rs);
        }
    }
}
