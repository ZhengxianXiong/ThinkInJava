package chap01.dto;

public class Circle extends Shape {
    @Override
    public void draw() {
        super.draw();
        System.out.println("circle");
    }
}
