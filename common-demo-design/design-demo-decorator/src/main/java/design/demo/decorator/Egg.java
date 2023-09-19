package design.demo.decorator;

import design.demo.decorator.component.FastFood;

/**
 * 鸡蛋
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood, "鸡蛋", 1);
    }
}
