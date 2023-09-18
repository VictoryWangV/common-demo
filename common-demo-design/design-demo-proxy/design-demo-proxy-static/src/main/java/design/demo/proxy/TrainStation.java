package design.demo.proxy;

/**
 * 真实主题类<br/>
 * 火车站
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
