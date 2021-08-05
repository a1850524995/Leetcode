package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggHandler implements InvocationHandler {
    private Object target;
    public LoggHandler(Object object){
        super();
        this.target = object;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o = method.invoke(target,args);
        return o;
    }
}
