package chap01.dto;

public class Light {

    public static void main(String[] args) {
        Light it = new Light();
        it.on();
    }

    public void on() {
        System.out.println("打开灯！");
    }

    public void off() {
        System.out.println("关闭灯！");
    }

    public void brighten() {
        System.out.println("调亮");
    }

    public void dim() {
        System.out.println("调暗");
    }
}
