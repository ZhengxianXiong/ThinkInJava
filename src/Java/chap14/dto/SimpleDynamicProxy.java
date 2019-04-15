package chap14.dto;

public class SimpleDynamicProxy {
    public static void consumer(Proxy proxy) {
        proxy.doSomething();
        proxy.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        Proxy proxy = (Proxy) java.lang.reflect.Proxy.newProxyInstance(Proxy.class.getClassLoader(),
                new Class[]{Proxy.class}, new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
