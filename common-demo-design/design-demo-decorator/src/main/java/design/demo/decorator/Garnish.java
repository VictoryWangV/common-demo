package design.demo.decorator;

import design.demo.decorator.component.FastFood;

/**
 * 抽象装饰（Decorator）角色 ： 继承或实现抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 */
public abstract class Garnish extends FastFood {

    private final FastFood fastFood;

    public Garnish(FastFood fastFood, String name, float price) {
        super(String.format("%s+%s", fastFood.getName(), name), price);
        this.fastFood = fastFood;
    }

    @Override
    public float cost() {
        return getPrice() + fastFood.cost();
    }
}
