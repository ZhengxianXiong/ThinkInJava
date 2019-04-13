package chap01.service;

import chap01.dto.Circle;
import chap01.dto.Shape;
import chap01.dto.Square;

public class Test {
    public void doSomething(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Test t = new Test();
        Circle c = new Circle();
        Square s = new Square();
        Shape sh = new Shape();
        sh = s;
        try {
            c = (Circle) sh;
        } catch (Exception e) {
            String str = e.getMessage();
            System.out.println(str);
        } finally {
            t.doSomething(c);
        }


//        t.doSomething(new Square());

    }
}
