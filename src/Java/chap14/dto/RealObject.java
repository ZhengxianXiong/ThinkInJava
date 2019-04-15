package chap14.dto;

public class RealObject implements Proxy {

    @Override
    public void doSomething() {
        System.out.println("RealObject.doSomething()");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("RealObject.somethingElse()" + arg);
    }
}
