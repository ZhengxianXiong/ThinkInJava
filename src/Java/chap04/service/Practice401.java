package chap04.service;

/**
 * 随机生成25个数，比较每个随机数和其后随机数的大小
 */
public class Practice401 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
//        for(int i=0; i<25; i++){
//            if(a!=0){
//                b = a;
//            }
//            a = Math.random();
//            System.out.println(a);
//            if(a!=0 && b!=0){
//                System.out.println(b>a);
//            }
//            System.out.println("=====================");
//        }
        while (true) {
            if (a != 0) {
                b = a;
            }
            a = Math.random();
            System.out.println(a);
            if (a != 0 && b != 0) {
                System.out.println(b > a);
            }
            System.out.println("=====================");
        }
    }
}
