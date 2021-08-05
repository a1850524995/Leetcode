package proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Moveable move = (Moveable) Proxy.newProxyInstance(Car.class.getClassLoader(),Car.class.getInterfaces(),new LoggHandler(new Car()));
        System.out.println("代理对象："+move.getClass().getName());
        System.out.println("执行方法:"+ move.move());
    }
}
