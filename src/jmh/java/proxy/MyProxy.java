package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {
    String state;
    public MyProxy(String d) {
        this.state = d;
    }

    @Override
    public Object invoke(Object serviceImpl, Method method, Object[] args) throws Throwable {
        return this.state + " " + method.getDeclaredAnnotation(Key.class).key();
    }
}
