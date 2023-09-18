package design.demo.proxy;

public class Client {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        TrainStation station = factory.getProxy();
        station.sell();
        System.out.println(station.getClass().getName());


        while (true){

        }
    }

}
