package chap01.dto;

public class Square extends Shape {
    @Override
    public void draw() {
        super.draw();
        System.out.println("square");
    }
}
