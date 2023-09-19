package design.demo.decorator.component;

/**
 * 快餐<br/>
 * 抽象构件角色。定义一个抽象接口以规范准备接收附加责任的对象。
 */
public abstract class FastFood {

    /**
     * 名称
     */
    private final String name;

    /**
     * 价格
     */
    private final float price;

    public FastFood(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    /**
     * 计算价格
     * @return 价格
     */
    public abstract float cost();

}
