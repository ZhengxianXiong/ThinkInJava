package chap14.service;

import chap14.dto.Proxy;
import chap14.dto.RealObject;
import chap14.dto.SimpleProxy;

public class SimpleProxyDemo {
    public static void consumer(Proxy proxy) {
        proxy.doSomething();
        proxy.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
