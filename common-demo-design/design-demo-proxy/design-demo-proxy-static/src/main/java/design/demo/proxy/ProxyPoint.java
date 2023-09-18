package design.demo.proxy;

/**
 * 代理类<br/>
 * 代售点
 */
public class ProxyPoint implements SellTickets {

    private final TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        // 代理类可以对被代理类的功能进行增强
        System.out.println("代售点收取一些服务费用");
        trainStation.sell();
    }
}
