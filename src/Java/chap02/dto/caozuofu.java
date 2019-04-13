package chap02.dto;

public class caozuofu {
    public static void main(String[] args) {
        String str = new String("xiong");
        switch (str) {
            case "xiong":
                System.out.println(1);
                break;
            case "zheng":
                System.out.println(2);
                break;
            default:
                break;
        }
    }
}
