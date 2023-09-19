package design.demo.decorator;

import design.demo.decorator.component.FastFood;

/**
 * 培根
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, "培根", 2);
    }
}
