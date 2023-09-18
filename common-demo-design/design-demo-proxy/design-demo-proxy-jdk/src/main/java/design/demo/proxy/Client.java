package design.demo.proxy;

public class Client {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        SellTickets proxy = factory.getProxy();
        proxy.sell();
        // 使用阿里开源的java应用诊断工具(arthas-boot.jar)可以分析生成的代理类结构
        // 命令: jad com.sun.proxy.$Proxy0
        System.out.println(proxy.getClass().getName());

        while (true){}

    }

}
