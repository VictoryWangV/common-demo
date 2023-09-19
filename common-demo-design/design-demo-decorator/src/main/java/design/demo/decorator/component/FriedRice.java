package design.demo.decorator.component;

/**
 * 炒面<br/>
 * 具体构件角色。实现抽象构件，通过装饰角色为其添加一些职责
 */
public class FriedRice extends FastFood {


    public FriedRice() {
        super("炒饭", 10L);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
