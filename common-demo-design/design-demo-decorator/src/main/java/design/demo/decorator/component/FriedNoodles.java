package design.demo.decorator.component;

/**
 * 炒面<br/>
 * 具体构件角色。实现抽象构件，通过装饰角色为其添加一些职责
 */
public class FriedNoodles extends FastFood {


    public FriedNoodles() {
        super("炒面", 12L);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
