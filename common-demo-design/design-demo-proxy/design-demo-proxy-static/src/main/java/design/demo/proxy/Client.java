package design.demo.proxy;

public class Client {

    public static void main(String[] args) {
        SellTickets proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }

}
