package design.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private final SellTickets sellTickets = new TrainStation();

    public SellTickets getProxy() {
        return (SellTickets)Proxy.newProxyInstance(
                // 类加载器，用于加载代理类。可以通过目标对象获取类加载器
                sellTickets.getClass().getClassLoader(),
                // 代理类实现的接口以的字节码对象
                sellTickets.getClass().getInterfaces(),
                // 代理对象的调用处理程序
                new InvocationHandler() {

                    /**
                     *
                     * @param proxy 代理对象
                     * @param method 对接口中的方法进行封装的对象
                     * @param args 调用方法的实际参数
                     * @return 返回值就是方法的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 代理类可以对被代理类的功能进行增强
                        System.out.println("代售点收取一些服务费用(JDK动态代理)");
                        // 调用目标对象的方法
                        return method.invoke(sellTickets, args);
                    }
                });

    }

}
