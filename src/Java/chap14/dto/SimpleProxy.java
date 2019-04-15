package chap14.dto;

public class SimpleProxy implements Proxy {
    private Proxy proxied;

    public SimpleProxy(Proxy proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy.doSomething()");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy.somethingElse()" + arg);
        proxied.somethingElse(arg);
    }
}
