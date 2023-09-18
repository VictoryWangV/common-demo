package design.demo.proxy;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private final TrainStation trainStation = new TrainStation();

    /**
     * cglib代理返回的是目标对象的子类
     * @return
     */
    public TrainStation getProxy() {
        // 创建Enhancer对象，类似于JDK代理中的Proxy
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        return (TrainStation) enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取一些服务费用(cglib动态代理)");
        return method.invoke(trainStation, objects);
    }
}
