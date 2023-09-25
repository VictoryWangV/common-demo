package design.demo.command;

/**
 * 商品
 */
public class Stock {

    /**
     * 名称
     */
    private final String name;
    /**
     * 数量
     */
    private final int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }

}
